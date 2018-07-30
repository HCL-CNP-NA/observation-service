package com.hcl.cnp.observationservice.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created by Tech Support on 7/29/2018.
 */
@FeignClient(name = "patient-service")
public interface PatientServiceClient {

    @GetMapping(name = "/observation/{observationId}")
    List findByObservation(@PathVariable("observationId") String observationId);
}
