/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.conferencewizard.db;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.TypedQuery;

/**
 *
 * @author CELEDONIO
 */
@Entity
public class ConfPaper implements Serializable{

    static void setEmail(String parameter) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long confPaperId;
    @ManyToMany
    private List<Person> authors;
    private String keywords;
    private String subject;
    private String description;
    private String title;
    private String paper;

    public ConfPaper(Long confPaperId, List<Person> authors, String keywords, String subject, String description, String title, String paper) {
        this.confPaperId = confPaperId;
        this.authors = authors;
        this.keywords = keywords;
        this.subject = subject;
        this.description = description;
        this.title = title;
        this.paper = paper;
    }

    public ConfPaper() {
    }   
    public ConfPaper add(){
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
            em.remove(this);
            trans.commit();
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            trans.rollback();
        } finally {
            em.close();
        }     
    }
    
    public static ConfPaper read(String email){
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        String readQuery = "Select c From ConfPaper c" +
                "Where c.email = :email";
        TypedQuery<ConfPaper> c = em.createQuery(readQuery, ConfPaper.class);
        
        try  {
            c.setParameter("email", email);
            return c.getSingleResult();
            
        } catch (Exception ex){
            System.out.println(ex.getMessage());
            trans.rollback();
        } finally {
            em.close();
        }
        return null;
    }
    

    public Long getConfPaperId() {
        return confPaperId;
    }

    public void setConfPaperId(Long confPaperId) {
        this.confPaperId = confPaperId;
    }

    public List<Person> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Person> authors) {
        this.authors = authors;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }
    
}
    
    

