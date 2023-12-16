package com.hannakot62.be.model;

import jakarta.persistence.*;

@Entity
@Table (name="promotions")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String description;
    @OneToOne
    @JoinColumn (name="picture_id")
    private Image picture;

    public Promotion() {
    }

    public Promotion(int id, String description, Image picture) {
        this.id = id;
        this.description = description;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }
}
