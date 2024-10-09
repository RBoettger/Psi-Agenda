package com.patient.psychology.service;

import com.patient.psychology.model.HealthPlanModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HealthPlanService {
    List<HealthPlanModel> getAll();
    HealthPlanModel save(HealthPlanModel healthPlanModel);
    void delete(HealthPlanModel healthPlanModel);

    Optional<HealthPlanModel> findById(UUID id);
}
