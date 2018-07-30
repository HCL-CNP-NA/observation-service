package com.hcl.cnp.observationservice.rest;

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

    @GetMapping(path = "/patient/{patientId}")
    public List<Observation> findByPatient(@PathVariable("patientId") String patientId) {
        return observationService.findByPatient(patientId);
    }

    @GetMapping(path = "/find-all")
    public List<Observation> findAll() {
        return observationService.findAll();
    }

    @GetMapping(path = "/find-one/{id}")
    public Observation findOne(@PathVariable("id") String id) {
        return observationService.findById(id);
    }

}
