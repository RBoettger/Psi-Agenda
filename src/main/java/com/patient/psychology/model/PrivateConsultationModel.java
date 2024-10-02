package com.patient.psychology.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name="TB_PRIVATE_CONSULTATION")
public class PrivateConsultationModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID privateConsultationId;
    private Double valuePerHour;

    public UUID getPrivateConsultationId() {
        return privateConsultationId;
    }

    public void setPrivateConsultationId(UUID privateConsultationId) {
        this.privateConsultationId = privateConsultationId;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    @Override
    public String toString() {
        return "R$ " + valuePerHour;
    }
}
