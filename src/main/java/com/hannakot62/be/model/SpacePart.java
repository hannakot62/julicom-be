package com.hannakot62.be.model;
import jakarta.persistence.*;


@Entity
@Table (name="space_parts")
public class SpacePart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String title;
    private String description;
    private double price;
    @OneToOne
    @JoinColumn (name="picture_id")
    private Image picture;

    public SpacePart() {
    }

    public SpacePart(int id, String title, String description, double price, Image picture) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.picture = picture;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Image getPicture() {
        return picture;
    }

    public void setPicture(Image picture) {
        this.picture = picture;
    }
}
