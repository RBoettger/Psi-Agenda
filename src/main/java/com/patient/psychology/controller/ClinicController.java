package com.patient.psychology.controller;

import com.patient.psychology.dtos.ClinicRecordDTO;
import com.patient.psychology.model.ClinicModel;
import com.patient.psychology.service.ClinicService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ClinicController {

    final ClinicService clinicService;

    public ClinicController(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @PostMapping("/clinic")
    public ResponseEntity <ClinicModel> saveClinic(@RequestBody @Valid
                                                   ClinicRecordDTO clinicRecordDTO){
        var clinic = new ClinicModel();
        BeanUtils.copyProperties(clinicRecordDTO, clinic);
        clinicService.save(clinic);
        System.out.println("Clinica " + clinic.getClinicName() + " cadastrada com sucesso!");
        return ResponseEntity.status(HttpStatus.CREATED).body(clinic);

    }
    @GetMapping("/clinic")
    public ResponseEntity <List<ClinicModel>> getAll(){
        var clinics = clinicService.getAll();
        return ResponseEntity.status(HttpStatus.OK).body(clinics);
    }
    @GetMapping("/clinic/{id}")
    public ResponseEntity <Object> getById(@PathVariable(value = "id")UUID id){
        Optional<ClinicModel> clincById = clinicService.findById(id);
        if(clincById.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Clinica não cadastrada.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(clincById);
    }
}
