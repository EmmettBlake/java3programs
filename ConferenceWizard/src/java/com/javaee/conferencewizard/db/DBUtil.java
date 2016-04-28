/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.conferencewizard.db;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Emmett
 */
public class DBUtil {
    private static final EntityManagerFactory EMF =
            Persistence.createEntityManagerFactory("ConferenceWizardPU");
    public static EntityManagerFactory getEmFactory(){
        return EMF;
    }
    
    public static List<Person> getAttendees() {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        List<Person> attendees = em.createQuery("SELECT e FROM Person e").getResultList();
        return attendees;
    }
    
    public static List<Conference> getConferences() {
                EntityManager em = DBUtil.getEmFactory().createEntityManager();
        List<Conference> conferences = em.createQuery("SELECT c FROM Conference c").getResultList();
        return conferences;
    }
}
