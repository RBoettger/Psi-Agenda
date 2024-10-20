package com.patient.psychology.controller;

import com.patient.psychology.dtos.SchedullingRecordDTO;
import com.patient.psychology.model.SchedulingModel;
import com.patient.psychology.service.SchedullingService;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class SchedullingController {

    final SchedullingService schedullingService;

    public SchedullingController(SchedullingService schedullingService){
        this.schedullingService = schedullingService;
    }

    @PostMapping("/agendamentos")
    public ResponseEntity <Object> newSchedulling(@RequestBody @Valid SchedullingRecordDTO
                                                           schedullingRecordDTO){
        var schedulling = new SchedulingModel();
        BeanUtils.copyProperties(schedullingRecordDTO, schedulling);
        schedullingService.save(schedulling);
        return ResponseEntity.status(HttpStatus.CREATED).body("Agendamento criado com sucesso.");
    }
}
