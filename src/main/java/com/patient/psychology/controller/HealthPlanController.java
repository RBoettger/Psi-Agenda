package com.patient.psychology.controller;

import com.patient.psychology.dtos.HealthPlanRecordDTO;
import com.patient.psychology.dtos.PatientRecordDTO;
import com.patient.psychology.model.HealthPlanModel;
import com.patient.psychology.service.HealthPlanService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;

@RestController
public class HealthPlanController {

    final HealthPlanService healthPlanService;

    public HealthPlanController(HealthPlanService healthPlanService){
        this.healthPlanService = healthPlanService;
    }

    @PostMapping("/plans")
    public ResponseEntity <HealthPlanModel> newPlan(@RequestBody @Valid
                                                    HealthPlanRecordDTO healthPlanRecordDTO){
        HealthPlanModel plan = new HealthPlanModel();
        BeanUtils.copyProperties(healthPlanRecordDTO, plan);
        healthPlanService.save(plan);
        return ResponseEntity.status(HttpStatus.CREATED).body(plan);
    }

    @GetMapping("/plans")
    public ResponseEntity <List<HealthPlanModel>> getAllPlans(){
        return ResponseEntity.status(HttpStatus.OK).body(healthPlanService.getAll());
    }

    @PutMapping("/plans/{id}")
    public ResponseEntity <HealthPlanModel> putPlans(@PathVariable(value="id")UUID id,
                                                     @RequestBody @Valid HealthPlanRecordDTO healthPlanRecordDTO){
        var plan0 = healthPlanService.findById(id);
        var plan1 = plan0.get();
        BeanUtils.copyProperties(healthPlanRecordDTO, plan1);

        return ResponseEntity.status(HttpStatus.OK).body(healthPlanService.save(plan1));
    }

    @DeleteMapping("/plans/{id}")
    public ResponseEntity <Object> deleteByIdPlan(@PathVariable(value = "id") UUID id){
        var plan = healthPlanService.findById(id);
        healthPlanService.delete(plan.get());
        return ResponseEntity.status(HttpStatus.OK).body("Plano de Saúde deletado com sucesso!");
    }
}
