package com.hcl.cnp.observationservice.service;

import com.hcl.cnp.observationservice.domain.Observation;

import java.util.List;

/**
 * Created by Tech Support on 7/29/2018.
 */
public interface ObservationService {

    List<Observation> findByPatient(String patientId);

    List<Observation> findAll();

    Observation findById(String id);
}
