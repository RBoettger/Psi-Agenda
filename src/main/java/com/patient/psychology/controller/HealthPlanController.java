package com.patient.psychology.controller;

import com.patient.psychology.dtos.HealthPlanRecordDTO;
import com.patient.psychology.model.HealthPlanModel;
import com.patient.psychology.service.HealthPlanService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
        return ResponseEntity.status(HttpStatus.CREATED).body(healthPlanService.save(plan));
    }

}
