package org.sda.java25.trainings2.courses;

import java.math.BigDecimal;

public class Course {

    private String name;

    private int maxParticipants;

    private BigDecimal price;

    public Course(String name, int maxParticipants, BigDecimal price) {
        this.name = name;
        this.maxParticipants = maxParticipants;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
