package com.patient.psychology.repository;

import com.patient.psychology.model.HealthPlanModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HealthPlanRepository extends JpaRepository <HealthPlanModel, UUID> {
}
