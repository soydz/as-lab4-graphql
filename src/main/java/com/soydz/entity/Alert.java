package com.soydz.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "alerts")
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "alert_type", nullable = false)
    private String alertType;

    @Column(nullable = false)
    private String responsible;

    @Column(nullable = false)
    private String priority;

    @Column(nullable = false)
    private String driver;

    @Column(name = "generating_unit", nullable = false)
    private String generatingUnit;

    @Column(nullable = false)
    private String state;

    @Column(name = "generation_date", nullable = false)
    private LocalDateTime generationDate;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public Alert() {}

    public Alert(String alertType, String responsible, String priority, String driver, String generatingUnit, String state, LocalDateTime generationDate) {
        this.alertType = alertType;
        this.responsible = responsible;
        this.priority = priority;
        this.driver = driver;
        this.generatingUnit = generatingUnit;
        this.state = state;
        this.generationDate = generationDate;
    }

    public Long getId() {
        return id;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getGeneratingUnit() {
        return generatingUnit;
    }

    public void setGeneratingUnit(String generatingUnit) {
        this.generatingUnit = generatingUnit;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getGenerationDate() {
        return generationDate;
    }

    public void setGenerationDate(LocalDateTime generationDate) {
        this.generationDate = generationDate;
    }
}
