package com.patient.psychology.dtos;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record PrivateConsultationRecordDTO(@NotNull Double valuePerHour) {
}
