package com.patient.psychology.service.PatientServiceImp;

import com.patient.psychology.model.ClinicModel;
import com.patient.psychology.repository.ClinicRepository;
import com.patient.psychology.service.ClinicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClinicServiceImpl implements ClinicService {

    final ClinicRepository clinicRepository;

    public ClinicServiceImpl(ClinicRepository clinicRepository){
        this.clinicRepository = clinicRepository;
    }

    @Override
    public List<ClinicModel> getAll() {
        return clinicRepository.findAll();
    }

    @Override
    public void save(ClinicModel clinicModel) {
        clinicRepository.save(clinicModel);
    }

    @Override
    public void delete(ClinicModel clinicModel) {
        clinicRepository.delete(clinicModel);
    }

    @Override
    public Optional<ClinicModel> findById(UUID id) {
        return clinicRepository.findById(id);
    }
}
