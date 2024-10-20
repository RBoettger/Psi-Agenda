package com.patient.psychology.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record HealthPlanRecordDTO(@NotBlank String planName, @NotNull Double valuePerHour) {
}
