package com.patient.psychology.service.PatientServiceImp;

import com.patient.psychology.model.PrivateConsultationModel;
import com.patient.psychology.repository.PrivateConsultationRepository;
import com.patient.psychology.service.PrivateConsultationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PrivateConsultationServiceImpl implements PrivateConsultationService {

    final PrivateConsultationRepository privateConsultationRepository;
    public PrivateConsultationServiceImpl(PrivateConsultationRepository privateConsultationRepository){
        this.privateConsultationRepository = privateConsultationRepository;
    }

    @Override
    public List<PrivateConsultationModel> getAll() {
        return privateConsultationRepository.findAll();
    }

    @Override
    public PrivateConsultationModel save(PrivateConsultationModel privateConsultationModel) {
        return privateConsultationRepository.save(privateConsultationModel);
    }

    @Override
    public void delete(PrivateConsultationModel privateConsultationModel) {
        privateConsultationRepository.delete(privateConsultationModel);
    }

    @Override
    public Optional<PrivateConsultationModel> findById(UUID id) {
       return privateConsultationRepository.findById(id);
    }
}
