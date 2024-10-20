package com.patient.psychology.service;

import com.patient.psychology.model.SchedulingModel;

import java.util.List;

public interface SchedullingService {
    List<SchedulingModel> getAll();
    void save(SchedulingModel schedulingModel);
    void delete(SchedulingModel schedulingModel);
}
