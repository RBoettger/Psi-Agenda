package com.patient.psychology.dtos;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public record PatientRecordDTO(@NotBlank String name, @NotBlank String cpf, @Temporal(TemporalType.DATE) LocalDate dateOfBirth, @NotBlank String sex,
                               @NotBlank String sexOrientation, @NotBlank String occupation) {
}