package com.patient.psychology.dtos;

import com.patient.psychology.model.HealthPlanModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClinicRecordDTO(@NotBlank String clinicName, @NotBlank String clinicFone,
                              @NotBlank String clinicAdress,
                              @NotNull Double roomRental) {
}
