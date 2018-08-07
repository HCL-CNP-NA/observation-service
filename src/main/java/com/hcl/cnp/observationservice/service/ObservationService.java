package com.hcl.cnp.observationservice.service;

import com.hcl.cnp.observationservice.domain.ObsEntity;
import com.hcl.cnp.observationservice.domain.Observation;

import java.util.List;

/**
 * Created by Tech Support on 7/29/2018.
 */
public interface ObservationService {

    List<ObsEntity> findAll();

    ObsEntity findOne(Integer id);

    //Mocks
    List<Observation> findByPatientMock(String patientId);

    List<Observation> findAllMock();

    Observation findByIdMock(String id);
}
