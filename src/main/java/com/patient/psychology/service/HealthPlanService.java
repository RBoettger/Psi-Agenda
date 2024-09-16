package com.patient.psychology.service;

import com.patient.psychology.model.HealthPlanModel;

import java.util.List;

public interface HealthPlanService {
    List<HealthPlanModel> getAll();
    void save(HealthPlanModel healthPlanModel);
    void delete(HealthPlanModel healthPlanModel);
}
