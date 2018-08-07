package com.hcl.cnp.observationservice.service.impl;

import com.hcl.cnp.observationservice.domain.ObsEntity;
import com.hcl.cnp.observationservice.domain.Observation;
import com.hcl.cnp.observationservice.domain.Patient;
import com.hcl.cnp.observationservice.repository.ObservationRepository;
import com.hcl.cnp.observationservice.service.ObservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Tech Support on 7/29/2018.
 */
@Service
public class ObservationServiceImpl implements ObservationService {

    @Autowired
    ObservationRepository observationRepository;

    @Override
    public List<ObsEntity> findAll() {
        return observationRepository.findAll();
    }

    @Override
    public ObsEntity findOne(Integer id) {
        return findOne(id);
    }

    private List<Observation> observations = new ArrayList<>();

    public Observation addMock(Observation observation) {
        observation.setId(String.valueOf(observations.size()+1));
        observations.add(observation);
        return observation;
    }

    public Observation findByIdMock(String id) {
        Optional<Observation> Observation = observations.stream().filter(a -> a.getId().equals(id)).findFirst();
        if (Observation.isPresent())
            return Observation.get();
        else
            return null;
    }

    public List<Observation> findAllMock() {
        fillData();
        return observations;
    }

    public List<Observation> findByPatientMock(String patientId) {
        fillData();
        List<Observation> list = observations.stream().filter(obs -> obs.getPatient().getId().equals(patientId)).collect(Collectors.toList());

        return list;
    }

    private void fillData() {
        if(observations.size() == 0) {
            addMock(new Observation(null, "Everything is ok", new Patient("3", "Jose", "Boucourt")));
            addMock(new Observation(null, "Any observation", new Patient("1", "Ben", "Winston")));
            addMock(new Observation(null, "Working well", new Patient("2", "Anil", "Grupta")));
        }
    }

}
