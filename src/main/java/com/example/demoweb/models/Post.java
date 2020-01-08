package com.example.demoweb.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String text;
    private Integer likes;
    private Date creationDate;

    public Post(){}

    public Post(String text, Date creationDate, Long id) {
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;

    }

    public String getText() {
        return text;
    }

    public void setLikes(int likes){
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public Integer getId() {
        return id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

}
