package com.hcl.cnp.observationservice.repository;

import com.hcl.cnp.observationservice.domain.Observation;
import com.hcl.cnp.observationservice.domain.Patient;
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
        fillData();
        return observations;
    }

    public List<Observation> findByPatient(String patientId) {
        fillData();
        List<Observation> list = observations.stream().filter(obs -> obs.getPatient().getId().equals(patientId)).collect(Collectors.toList());

        return list;
    }

    private void fillData() {
        if(observations.size() == 0) {
            add(new Observation(null, "Everything is ok", new Patient("3", "Jose", "Boucourt")));
            add(new Observation(null, "Any observation", new Patient("1", "Ben", "Winston")));
            add(new Observation(null, "Working well", new Patient("2", "Anil", "Grupta")));
        }
    }

}
