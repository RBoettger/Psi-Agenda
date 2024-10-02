package com.patient.psychology.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="TB_SCHEDULING")
public class SchedulingModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idScheduling;
    private PatientModel patient;
    private Date date;
    private HealthPlanModel healthPlans;

    public UUID getIdScheduling() {
        return idScheduling;
    }

    public void setIdScheduling(UUID idScheduling) {
        this.idScheduling = idScheduling;
    }

    public PatientModel getPatient() {
        return patient;
    }

    public void setPatient(PatientModel patient) {
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public HealthPlanModel getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(HealthPlanModel healthPlans) {
        this.healthPlans = healthPlans;
    }
}
