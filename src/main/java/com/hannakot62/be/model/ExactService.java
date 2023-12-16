package com.hannakot62.be.model;
import jakarta.persistence.*;

@Entity
@Table (name="exact_services")
public class ExactService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private String jobTitle;
    private String unit;
    private double price;

    public ExactService() {
    }

    public ExactService(int id, String jobTitle, String unit, double price) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.unit = unit;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
