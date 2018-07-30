package com.hcl.cnp.observationservice.service.impl;

import com.hcl.cnp.observationservice.domain.Observation;
import com.hcl.cnp.observationservice.repository.ObservationRepository;
import com.hcl.cnp.observationservice.service.ObservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by Tech Support on 7/29/2018.
 */
@Service
public class ObservationServiceImpl implements ObservationService {

    @Autowired
    ObservationRepository observationRepository;

    public List<Observation> findByPatient(String patientId) {
        return observationRepository.findByPatient(patientId);
    }

    public List<Observation> findAll() {
        return observationRepository.findAll();
    }

    public Observation findById(String id) {
        return observationRepository.findById(id);
    }

}
