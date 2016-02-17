/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blake.emmett;
import java.io.Serializable;
/**
 *
 * @author Emmett
 */
public class UserInterestsBean implements Serializable {
    private String favorite_Genre_Music;
    private String favorite_Genre_Fiction;
    private String favorite_Sport;
    private String favorite_Musician;
    private String favorite_Movie;
    private String favorite_TV_Show;
    private String favorite_book;
    private String favorite_Team;
    private String favorite_Athlete;
    private String favorite_Artist;

    public UserInterestsBean() {
        favorite_Genre_Music = favorite_Genre_Fiction
                             = favorite_Sport
                             = favorite_Musician
                             = favorite_Movie
                             = favorite_TV_Show
                             = favorite_book
                             = favorite_Team
                             = favorite_Athlete
                             = favorite_Artist
                             = " ";
    }

    public UserInterestsBean(String favorite_Genre_Music, 
                             String favorite_Genre_Fiction, 
                             String favorite_Sport, 
                             String favorite_Musician, 
                             String favorite_Movie, 
                             String favorite_book, 
                             String favorite_Team, 
                             String favorite_Athlete, 
                             String favorite_Artist) {
        this.favorite_Genre_Music = favorite_Genre_Music;
        this.favorite_Genre_Fiction = favorite_Genre_Fiction;
        this.favorite_Sport = favorite_Sport;
        this.favorite_Musician = favorite_Musician;
        this.favorite_Movie = favorite_Movie;
        this.favorite_book = favorite_book;
        this.favorite_Team = favorite_Team;
        this.favorite_Athlete = favorite_Athlete;
        this.favorite_Artist = favorite_Artist;
    }

    public String getFavorite_Genre_Music() {
        return favorite_Genre_Music;
    }

    public void setFavorite_Genre_Music(String favorite_Genre_Music) {
        this.favorite_Genre_Music = favorite_Genre_Music;
    }

    public String getFavorite_Genre_Fiction() {
        return favorite_Genre_Fiction;
    }

    public void setFavorite_Genre_Fiction(String favorite_Genre_Fiction) {
        this.favorite_Genre_Fiction = favorite_Genre_Fiction;
    }

    public String getFavorite_Sport() {
        return favorite_Sport;
    }

    public void setFavorite_Sport(String favorite_Sport) {
        this.favorite_Sport = favorite_Sport;
    }

    public String getFavorite_Musician() {
        return favorite_Musician;
    }

    public void setFavorite_Musician(String favorite_Musician) {
        this.favorite_Musician = favorite_Musician;
    }

    public String getFavorite_Movie() {
        return favorite_Movie;
    }

    public void setFavorite_Movie(String favorite_Movie) {
        this.favorite_Movie = favorite_Movie;
    }

    public String getFavorite_TV_Show() {
        return favorite_TV_Show;
    }

    public void setFavorite_TV_Show(String favorite_TV_Show) {
        this.favorite_TV_Show = favorite_TV_Show;
    }

    public String getFavorite_book() {
        return favorite_book;
    }

    public void setFavorite_book(String favorite_book) {
        this.favorite_book = favorite_book;
    }

    public String getFavorite_Team() {
        return favorite_Team;
    }

    public void setFavorite_Team(String favorite_Team) {
        this.favorite_Team = favorite_Team;
    }

    public String getFavorite_Athlete() {
        return favorite_Athlete;
    }

    public void setFavorite_Athlete(String favorite_Athlete) {
        this.favorite_Athlete = favorite_Athlete;
    }

    public String getFavorite_Artist() {
        return favorite_Artist;
    }

    public void setFavorite_Artist(String favorite_Artist) {
        this.favorite_Artist = favorite_Artist;
    }
    
    
    
}
