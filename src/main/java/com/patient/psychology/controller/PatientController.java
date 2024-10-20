package com.patient.psychology.controller;

import com.patient.psychology.dtos.PatientRecordDTO;
import com.patient.psychology.model.PatientModel;
import com.patient.psychology.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;


@RestController
public class PatientController {

    final PatientService patientService;

    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }
    @PostMapping("/pacientes")
    public ResponseEntity <PatientModel> newPatient(@RequestBody @Valid PatientRecordDTO patientRecordDTO){
       var patient = new PatientModel();
        BeanUtils.copyProperties(patientRecordDTO, patient);
        patientService.save(patient);
        return ResponseEntity.status(HttpStatus.CREATED).body((patient));
    }
    @GetMapping("/patient")
    public ResponseEntity <List<PatientModel>> getPatient(){
        return ResponseEntity.status(HttpStatus.OK).body(patientService.getAll());
    }
    @GetMapping("/patient/{id}")
    public ResponseEntity <Object> getPatientById(@PathVariable(value = "id") UUID id){
        var patient = patientService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(patient.get());
    }
    @PutMapping("/patient/{id}")
    public ResponseEntity <Object> putPatient(@PathVariable(value = "id") UUID id, @RequestBody @Valid
                                                    PatientRecordDTO patientRecordDTO){
        var patient0 = patientService.findById(id);
        var patient = patient0.get();
        BeanUtils.copyProperties(patientRecordDTO, patient);
        return ResponseEntity.status(HttpStatus.OK).body(patientService.save(patient));
    }
    @DeleteMapping("/patient/{id}")
    public ResponseEntity <Object> deletePatientId(@PathVariable(value = "id")UUID id){
        Optional <PatientModel> patient = patientService.findById(id);
        patientService.delete(patient.get());
        return ResponseEntity.status(HttpStatus.OK).body("Usuário deletado com sucesso!");
    }
}
