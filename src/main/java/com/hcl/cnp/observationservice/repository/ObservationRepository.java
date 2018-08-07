package com.hcl.cnp.observationservice.repository;

import com.hcl.cnp.observationservice.domain.ObsEntity;
import com.hcl.cnp.observationservice.domain.Observation;
import com.hcl.cnp.observationservice.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Tech Support on 7/29/2018.
 */
@Repository
public interface ObservationRepository extends JpaRepository<ObsEntity, Integer>{

}
