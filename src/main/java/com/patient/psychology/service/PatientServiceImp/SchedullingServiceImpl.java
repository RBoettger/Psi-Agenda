package com.patient.psychology.service.PatientServiceImp;

import com.patient.psychology.model.SchedulingModel;
import com.patient.psychology.repository.SchedullingRepository;
import com.patient.psychology.service.SchedullingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchedullingServiceImpl implements SchedullingService {

    final SchedullingRepository schedullingRepository;

    public SchedullingServiceImpl(SchedullingRepository schedullingRepository){
        this.schedullingRepository = schedullingRepository;
    }

    @Override
    public List<SchedulingModel> getAll() {
        return schedullingRepository.findAll();
    }

    @Override
    public void save(SchedulingModel schedulingModel) {
        schedullingRepository.save(schedulingModel);
    }

    @Override
    public void delete(SchedulingModel schedulingModel) {
        schedullingRepository.delete(schedulingModel);
    }
}
