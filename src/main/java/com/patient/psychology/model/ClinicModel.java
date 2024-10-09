package com.patient.psychology.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_CLINIC")
public class ClinicModel implements Serializable {
    private static final long serialVersion = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID clinicID;
    private String clinicName;
    private String clinicFone;
    private String clinicAdress;
    private HealthPlanModel healthPlan;
    private Double roomRental;

    public UUID getClinicID() {
        return clinicID;
    }

    public void setClinicID(UUID clinicID) {
        this.clinicID = clinicID;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getClinicFone() {
        return clinicFone;
    }

    public void setClinicFone(String clinicFone) {
        this.clinicFone = clinicFone;
    }

    public String getClinicAdress() {
        return clinicAdress;
    }

    public void setClinicAdress(String clinicAdress) {
        this.clinicAdress = clinicAdress;
    }

    public HealthPlanModel getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(HealthPlanModel healthPlan) {
        this.healthPlan = healthPlan;
    }

    public Double getRoomRental() {
        return roomRental;
    }

    public void setRoomRental(Double roomRental) {
        this.roomRental = roomRental;
    }
}
