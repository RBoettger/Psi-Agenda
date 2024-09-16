package com.patient.psychology.service.PatientServiceImp;

import com.patient.psychology.model.PatientModel;
import com.patient.psychology.repository.PatientRepository;
import com.patient.psychology.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PatientServiceImp implements PatientService {

    final PatientRepository patientRepository;

    public PatientServiceImp(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public List<PatientModel> getAll() {
        return patientRepository.findAll();
    }

    @Override
    public PatientModel save(PatientModel patientModel) {
        return patientRepository.save(patientModel);
    }

    @Override
    public void delete(PatientModel patientModel) {
        patientRepository.delete(patientModel);
    }

    @Override
    public Optional<PatientModel> findById(UUID id) {
        return patientRepository.findById(id);
    }
}
