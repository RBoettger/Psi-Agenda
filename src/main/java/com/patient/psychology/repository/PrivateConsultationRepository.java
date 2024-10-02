package com.patient.psychology.repository;

import com.patient.psychology.model.PrivateConsultationModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrivateConsultationRepository extends JpaRepository<PrivateConsultationModel, UUID> {
}
