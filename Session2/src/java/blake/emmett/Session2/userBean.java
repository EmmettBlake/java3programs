/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blake.emmett.Session2;

import java.io.Serializable;
/**
 *
 * @author Emmett
 */
public class userBean implements Serializable {
    private String lastName;
    private String firstName;
    private String emailAddress;

    public userBean() {
        this.lastName = this.firstName = this.emailAddress = "";
    }
    public userBean(String lastName, String firstName, String emailAddress) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.emailAddress = emailAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
    
    
    
}
