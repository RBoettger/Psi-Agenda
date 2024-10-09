package com.patient.psychology.repository;

import com.patient.psychology.model.PatientModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PatientRepository extends JpaRepository<PatientModel, UUID> {
}
