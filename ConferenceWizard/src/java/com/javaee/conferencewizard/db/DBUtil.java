/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.conferencewizard.db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Emmett
 */
public class DBUtil {
    private static final EntityManagerFactory EMF =
            Persistence.createEntityManagerFactory("ConferencWizardPU");
    public static EntityManagerFactory getEmFactory(){
        return EMF;
    }
}
