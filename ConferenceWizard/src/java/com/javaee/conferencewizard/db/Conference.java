/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.conferencewizard.db;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.DATE;
import javax.persistence.TypedQuery;

/**
 *
 * @author Emmett
 */
@Entity
public class Conference {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long confId;
    private String confName;
    @Temporal(DATE)
    private Date startDate;
    @Temporal(DATE)
    private Date endDate;
    private Double cost;
    @ManyToMany(fetch=FetchType.LAZY)
    private List<Person> attendees;
    @OneToMany(mappedBy="conference")
    private List<Room> rooms;



    public Conference(Long confId, String confName, Date startDate, Date endDate, Double cost, List<Person> attendees) {
        this.confId = confId;
        this.confName = confName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cost = cost;
        this.attendees = attendees;
    }

    public Conference() {
    }

    public Conference add() {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        try  {
            trans.begin();
            em.persist(this);
            trans.commit();
            return this;
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            trans.rollback();
        } finally {
            em.close();
        }
        
        return null;
    }
    
        public void change(){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        try  {
            trans.begin();
            em.merge(this);
            trans.commit();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            trans.rollback();
        } finally {
            em.close();
        }
    }
        public void delete(){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        try  {
            trans.begin();
            Conference c = em.find(this.getClass(), this.getConfId());
            em.remove(c);
            trans.commit();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            trans.rollback();
        } finally {
            em.close();
        }     
    }
    
    public static Conference read(String confName){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        String readQuery = "Select c From Conference c " +
                           " Where c.confName = :confName";
        TypedQuery<Conference> c = em.createQuery(readQuery, Conference.class);
        
       try  {
            c.setParameter("confName", confName);
            return c.getSingleResult();
            
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            trans.rollback();
        } finally {
            em.close();
        }
        return null;
    }

    public Long getConfId() {
        return confId;
    }

    public void setConfId(Long confId) {
        this.confId = confId;
    }

    public String getConfName() {
        return confName;
    }

    public void setConfName(String confName) {
        this.confName = confName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public List<Person> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Person> attendees) {
        this.attendees = attendees;
    }
        public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
