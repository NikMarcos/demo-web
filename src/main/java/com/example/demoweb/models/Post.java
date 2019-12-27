package com.example.demoweb.models;

import java.util.Date;

public class Post {

    private String text;
    private Integer likes;
    private String creationDate;

    public Post(String text, String creationDate) {
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }

    public String getCreationDate() {
        return creationDate;
    }

}
