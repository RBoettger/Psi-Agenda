package com.patient.psychology.controller;

import com.patient.psychology.dtos.PrivateConsultationRecordDTO;
import com.patient.psychology.model.PrivateConsultationModel;
import com.patient.psychology.repository.PrivateConsultationRepository;
import com.patient.psychology.service.PrivateConsultationService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class PrivateConsultationController {

    final PrivateConsultationService privateConsultationService;

    public PrivateConsultationController(PrivateConsultationService privateConsultationService){
        this.privateConsultationService = privateConsultationService;
    }

    @PostMapping("/privateConsultation")
    public ResponseEntity <PrivateConsultationModel> newPrivateConsultation(@RequestBody @Valid PrivateConsultationRecordDTO privateConsultationRecordDTO){
        var privateConsultation = new PrivateConsultationModel();
        BeanUtils.copyProperties(privateConsultationRecordDTO, privateConsultation);
        privateConsultationService.save(privateConsultation);
        return ResponseEntity.status(HttpStatus.CREATED).body((privateConsultation));
    }

    @GetMapping("/privateConsultation")
    public ResponseEntity <List<PrivateConsultationModel>> getPrivateConsultationAll(){
        return ResponseEntity.status(HttpStatus.OK).body(privateConsultationService.getAll());
    }

    @PutMapping("/privateConsultation/{id}")
    public ResponseEntity <Object> putPrivateConsultation(@PathVariable(value = "id") UUID id, @RequestBody @Valid PrivateConsultationRecordDTO privateConsultationRecordDTO){
        Optional<PrivateConsultationModel> privateConsultation = privateConsultationService.findById(id);
        var privateConsultation0 = privateConsultation.get();
        BeanUtils.copyProperties(privateConsultationRecordDTO, privateConsultation0);
        privateConsultationService.save(privateConsultation0);
        return ResponseEntity.status(HttpStatus.OK).body("Valor da consulta particular atualizado para " + privateConsultation.get() + " reais.");
    }

}
