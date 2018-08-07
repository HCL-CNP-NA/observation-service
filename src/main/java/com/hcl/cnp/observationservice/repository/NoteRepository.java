package com.hcl.cnp.observationservice.repository;

import com.hcl.cnp.observationservice.domain.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Tech Support on 8/7/2018.
 */
@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Integer> {

}
