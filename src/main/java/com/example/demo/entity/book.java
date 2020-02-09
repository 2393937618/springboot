package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class book {
    @Id
    @GeneratedValue
    public Integer tid;
    public String title;
    public String author;
    public String publication;
    public String publisher;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getEdition_num() {
        return edition_num;
    }

    public void setEdition_num(Integer edition_num) {
        this.edition_num = edition_num;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getEditior_num() {
        return editor_num;
    }

    public void setEditior_num(int editior_num) {
        this.editor_num = editior_num;
    }

    public Integer edition_num;
    public String award;
    public String cover;
    public int editor_num;

}
