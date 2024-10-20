package com.patient.psychology.service;

import com.patient.psychology.model.ClinicModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ClinicService {
    List<ClinicModel> getAll();
    void save(ClinicModel clinicModel);
    void delete(ClinicModel clinicModel);
    Optional<ClinicModel> findById(UUID id);


}
