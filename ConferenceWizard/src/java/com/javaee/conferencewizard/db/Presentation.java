/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.conferencewizard.db;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import static javax.persistence.TemporalType.TIMESTAMP;

/**
 *
 * @author Emmett
 */
@Entity
public class Presentation implements Serializable {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private Long presentationId;
   @Temporal(TemporalType.TIMESTAMP)
   private Date startTime;
   @Temporal(TemporalType.TIMESTAMP)
   private Date endTime;
   @OneToOne
   private ConfPaper paper;
   @ManyToMany(mappedBy="presentations")
   private List<Person> presenters;
   private String title;
   @ManyToOne
   private Room room;

    public Presentation(Long presentationId, Date startTime, Date endTime, ConfPaper paper, List<Person> presenters, String title) {
        this.presentationId = presentationId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.paper = paper;
        this.presenters = presenters;
        this.title = title;
    }

    public Presentation() {
    }

    public Long getPresentationId() {
        return presentationId;
    }

    public void setPresentationId(Long presentationId) {
        this.presentationId = presentationId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public ConfPaper getPaper() {
        return paper;
    }

    public void setPaper(ConfPaper paper) {
        this.paper = paper;
    }

    public List<Person> getPresenters() {
        return presenters;
    }

    public void setPresenters(List<Person> presenters) {
        this.presenters = presenters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
   
   
   
}
