package com.patient.psychology.repository;

import com.patient.psychology.model.ClinicModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClinicRepository extends JpaRepository<ClinicModel, UUID> {
}
