package com.hannakot62.be.model;
import jakarta.persistence.*;

@Entity
@Table (name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String items;
    private double totalCost;
    @ManyToOne
    @JoinColumn (name="user_id")
    private Users user;

    public Order() {
    }

    public Order(int id, String items, double totalCost, Users user) {
        this.id = id;
        this.items = items;
        this.totalCost = totalCost;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
