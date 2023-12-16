package com.hannakot62.be.model;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name="news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String title;
    private String description;
    private Date datePublished;

    public News() {
    }

    public News(int id, String title, String description, Date datePublished) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.datePublished = datePublished;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }
}
