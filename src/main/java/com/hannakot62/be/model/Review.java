package com.hannakot62.be.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table (name="reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn (name="space_part_id")
    private SpacePart spacePart;
    @OneToMany
    @JoinColumn (name="user_id")
    private List<Users> user;
    private double rating;
    private String reviewText;
    private String response;

    public Review() {
    }

    public Review(int id, SpacePart spacePart, List<Users> user, double rating, String reviewText, String response) {
        this.id = id;
        this.spacePart = spacePart;
        this.user = user;
        this.rating = rating;
        this.reviewText = reviewText;
        this.response = response;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SpacePart getSpacePart() {
        return spacePart;
    }

    public void setSpacePart(SpacePart spacePart) {
        this.spacePart = spacePart;
    }

    public List<Users> getUser() {
        return user;
    }

    public void setUser(List<Users> user) {
        this.user = user;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
