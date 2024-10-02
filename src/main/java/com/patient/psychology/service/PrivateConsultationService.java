package com.patient.psychology.service;

import com.patient.psychology.model.PrivateConsultationModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PrivateConsultationService {
    List<PrivateConsultationModel> getAll();
    PrivateConsultationModel save(PrivateConsultationModel privateConsultationModel);
    void delete(PrivateConsultationModel privateConsultationModel);
    Optional<PrivateConsultationModel> findById(UUID id);
}
