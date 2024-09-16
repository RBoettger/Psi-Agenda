package com.patient.psychology.service;

import com.patient.psychology.model.PatientModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PatientService {
    List<PatientModel> getAll();

    PatientModel save(PatientModel patientModel);
    void delete(PatientModel patientModel);
    Optional<PatientModel> findById(UUID id);
}
