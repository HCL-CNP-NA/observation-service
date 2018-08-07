package com.hcl.cnp.observationservice.rest;

import com.hcl.cnp.observationservice.domain.ObsEntity;
import com.hcl.cnp.observationservice.domain.Observation;
import com.hcl.cnp.observationservice.repository.ObservationRepository;
import com.hcl.cnp.observationservice.service.ObservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Tech Support on 7/29/2018.
 */
@RestController
public class ObservationResource {

    @Autowired
    ObservationService observationService;

    @GetMapping(path = "/find-all")
    public List<ObsEntity> findAll() {
        return observationService.findAll();
    }

    @GetMapping(path = "find-one/{id}")
    public ObsEntity findOne(@PathVariable("id") Integer id) {
        return observationService.findOne(id);
    }

    //Mocks
    @GetMapping(path = "/patient-mock/{patientId}")
    public List<Observation> findByPatientMock(@PathVariable("patientId") String patientId) {
        return observationService.findByPatientMock(patientId);
    }

    @GetMapping(path = "/find-all-mock")
    public List<Observation> findAllMock() {
        return observationService.findAllMock();
    }

    @GetMapping(path = "/find-one-mock/{id}")
    public Observation findOneMock(@PathVariable("id") String id) {
        return observationService.findByIdMock(id);
    }



}
