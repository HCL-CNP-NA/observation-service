package com.hcl.cnp.observationservice.domain;

/**
 * Created by Tech Support on 7/29/2018.
 */
public class Observation {

    private String id;
    private String description;
    private Patient patient;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Observation() {
    }

    public Observation(String id, String description, Patient patient) {
        this.id = id;
        this.description = description;
        this.patient = patient;
    }
}
