package com.patient.psychology.repository;

import com.patient.psychology.model.SchedulingModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SchedullingRepository extends JpaRepository<SchedulingModel, UUID> {
}
