package com.patient.psychology.service.PatientServiceImp;

import com.patient.psychology.model.HealthPlanModel;
import com.patient.psychology.repository.HealthPlanRepository;
import com.patient.psychology.service.HealthPlanService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class HealthPlanServiceImpl implements HealthPlanService {

    final HealthPlanRepository healthPlanRepository;

    public HealthPlanServiceImpl(HealthPlanRepository healthPlanRepository){
        this.healthPlanRepository = healthPlanRepository;
    }

    @Override
    public List<HealthPlanModel> getAll() {
        return healthPlanRepository.findAll();
    }

    @Override
    public HealthPlanModel save(HealthPlanModel healthPlanModel) {
        return healthPlanRepository.save(healthPlanModel);
    }

    @Override
    public void delete(HealthPlanModel healthPlanModel) {
        healthPlanRepository.delete(healthPlanModel);
    }

    @Override
    public Optional<HealthPlanModel> findById(UUID id){
        return healthPlanRepository.findById(id);
    }
}