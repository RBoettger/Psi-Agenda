package com.patient.psychology.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="TB_HEALTHPLAN")
public class HealthPlanModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idPlan;
    private String planName;
    private Double valuePerHour;
    private Double amountHours;

    public UUID getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(UUID idPlan) {
        this.idPlan = idPlan;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double closeHours(Double valuePerHour,  Double amountHours){
        return valuePerHour * amountHours;
    }
}
