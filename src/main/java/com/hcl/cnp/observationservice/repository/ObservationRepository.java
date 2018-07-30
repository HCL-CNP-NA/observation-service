package com.hcl.cnp.observationservice.repository;

import com.hcl.cnp.observationservice.domain.Observation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Tech Support on 7/29/2018.
 */
@Service
public class ObservationRepository {

    private List<Observation> observations = new ArrayList<>();

    public Observation add(Observation observation) {
        observation.setId(String.valueOf(observations.size()+1));
        observations.add(observation);
        return observation;
    }

    public Observation findById(String id) {
        Optional<Observation> Observation = observations.stream().filter(a -> a.getId().equals(id)).findFirst();
        if (Observation.isPresent())
            return Observation.get();
        else
            return null;
    }

    public List<Observation> findAll() {
        return observations;
    }

    public List<Observation> findByPatient(String patientId) {
        return observations.stream().filter(obs -> obs.getPatient().equals(patientId)).collect(Collectors.toList());
    }

}
