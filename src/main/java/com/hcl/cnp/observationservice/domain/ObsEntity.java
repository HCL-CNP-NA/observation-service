package com.hcl.cnp.observationservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tech Support on 8/7/2018.
 */
@Entity
@Table(name = "obs")
public class ObsEntity {

    @Id
    @Column(name = "obs_id")
    private Integer obsId;

    @Basic
    @Column(name = "obs_datetime")
    private Timestamp obsDatetime;

    @Basic
    @Column(name = "accession_number")
    private String accessionNumber;

    @Basic
    @Column(name = "value_group_id")
    private Integer valueGroupId;

    @Basic
    @Column(name = "value_datetime")
    private Timestamp valueDatetime;

    @Basic
    @Column(name = "value_numeric")
    private Double valueNumeric;

    @Basic
    @Column(name = "value_modifier")
    private String valueModifier;

    @Basic
    @Column(name = "value_text")
    private String valueText;

    @Basic
    @Column(name = "value_complex")
    private String valueComplex;

    @Basic
    @Column(name = "comments")
    private String comments;

    @Basic
    @Column(name = "date_created")
    private Timestamp dateCreated;

    @Basic
    @Column(name = "voided")
    private Byte voided;

    @Basic
    @Column(name = "date_voided")
    private Timestamp dateVoided;

    @Basic
    @Column(name = "void_reason")
    private String voidReason;

    @Basic
    @Column(name = "uuid")
    private String uuid;

    @Basic
    @Column(name = "form_namespace_and_path")
    private String formNamespaceAndPath;

    @ManyToOne
    @JoinColumn(name = "obs_group_id", referencedColumnName = "obs_id")
    private ObsEntity obsByObsGroupId;

    @ManyToOne
    @JoinColumn(name = "previous_version", referencedColumnName = "obs_id")
    private ObsEntity obsByPreviousVersion;

    public Integer getObsId() {
        return obsId;
    }

    public void setObsId(Integer obsId) {
        this.obsId = obsId;
    }

    public Timestamp getObsDatetime() {
        return obsDatetime;
    }

    public void setObsDatetime(Timestamp obsDatetime) {
        this.obsDatetime = obsDatetime;
    }

    public String getAccessionNumber() {
        return accessionNumber;
    }

    public void setAccessionNumber(String accessionNumber) {
        this.accessionNumber = accessionNumber;
    }

    public Integer getValueGroupId() {
        return valueGroupId;
    }

    public void setValueGroupId(Integer valueGroupId) {
        this.valueGroupId = valueGroupId;
    }

    public Timestamp getValueDatetime() {
        return valueDatetime;
    }

    public void setValueDatetime(Timestamp valueDatetime) {
        this.valueDatetime = valueDatetime;
    }

    public Double getValueNumeric() {
        return valueNumeric;
    }

    public void setValueNumeric(Double valueNumeric) {
        this.valueNumeric = valueNumeric;
    }

    public String getValueModifier() {
        return valueModifier;
    }

    public void setValueModifier(String valueModifier) {
        this.valueModifier = valueModifier;
    }

    public String getValueText() {
        return valueText;
    }

    public void setValueText(String valueText) {
        this.valueText = valueText;
    }

    public String getValueComplex() {
        return valueComplex;
    }

    public void setValueComplex(String valueComplex) {
        this.valueComplex = valueComplex;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Byte getVoided() {
        return voided;
    }

    public void setVoided(Byte voided) {
        this.voided = voided;
    }

    public Timestamp getDateVoided() {
        return dateVoided;
    }

    public void setDateVoided(Timestamp dateVoided) {
        this.dateVoided = dateVoided;
    }

    public String getVoidReason() {
        return voidReason;
    }

    public void setVoidReason(String voidReason) {
        this.voidReason = voidReason;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getFormNamespaceAndPath() {
        return formNamespaceAndPath;
    }

    public void setFormNamespaceAndPath(String formNamespaceAndPath) {
        this.formNamespaceAndPath = formNamespaceAndPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObsEntity obsEntity = (ObsEntity) o;

        if (obsId != null ? !obsId.equals(obsEntity.obsId) : obsEntity.obsId != null) return false;
        if (obsDatetime != null ? !obsDatetime.equals(obsEntity.obsDatetime) : obsEntity.obsDatetime != null)
            return false;
        if (accessionNumber != null ? !accessionNumber.equals(obsEntity.accessionNumber) : obsEntity.accessionNumber != null)
            return false;
        if (valueGroupId != null ? !valueGroupId.equals(obsEntity.valueGroupId) : obsEntity.valueGroupId != null)
            return false;
        if (valueDatetime != null ? !valueDatetime.equals(obsEntity.valueDatetime) : obsEntity.valueDatetime != null)
            return false;
        if (valueNumeric != null ? !valueNumeric.equals(obsEntity.valueNumeric) : obsEntity.valueNumeric != null)
            return false;
        if (valueModifier != null ? !valueModifier.equals(obsEntity.valueModifier) : obsEntity.valueModifier != null)
            return false;
        if (valueText != null ? !valueText.equals(obsEntity.valueText) : obsEntity.valueText != null) return false;
        if (valueComplex != null ? !valueComplex.equals(obsEntity.valueComplex) : obsEntity.valueComplex != null)
            return false;
        if (comments != null ? !comments.equals(obsEntity.comments) : obsEntity.comments != null) return false;
        if (dateCreated != null ? !dateCreated.equals(obsEntity.dateCreated) : obsEntity.dateCreated != null)
            return false;
        if (voided != null ? !voided.equals(obsEntity.voided) : obsEntity.voided != null) return false;
        if (dateVoided != null ? !dateVoided.equals(obsEntity.dateVoided) : obsEntity.dateVoided != null) return false;
        if (voidReason != null ? !voidReason.equals(obsEntity.voidReason) : obsEntity.voidReason != null) return false;
        if (uuid != null ? !uuid.equals(obsEntity.uuid) : obsEntity.uuid != null) return false;
        if (formNamespaceAndPath != null ? !formNamespaceAndPath.equals(obsEntity.formNamespaceAndPath) : obsEntity.formNamespaceAndPath != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = obsId != null ? obsId.hashCode() : 0;
        result = 31 * result + (obsDatetime != null ? obsDatetime.hashCode() : 0);
        result = 31 * result + (accessionNumber != null ? accessionNumber.hashCode() : 0);
        result = 31 * result + (valueGroupId != null ? valueGroupId.hashCode() : 0);
        result = 31 * result + (valueDatetime != null ? valueDatetime.hashCode() : 0);
        result = 31 * result + (valueNumeric != null ? valueNumeric.hashCode() : 0);
        result = 31 * result + (valueModifier != null ? valueModifier.hashCode() : 0);
        result = 31 * result + (valueText != null ? valueText.hashCode() : 0);
        result = 31 * result + (valueComplex != null ? valueComplex.hashCode() : 0);
        result = 31 * result + (comments != null ? comments.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (voided != null ? voided.hashCode() : 0);
        result = 31 * result + (dateVoided != null ? dateVoided.hashCode() : 0);
        result = 31 * result + (voidReason != null ? voidReason.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (formNamespaceAndPath != null ? formNamespaceAndPath.hashCode() : 0);
        return result;
    }

    public ObsEntity getObsByObsGroupId() {
        return obsByObsGroupId;
    }

    public void setObsByObsGroupId(ObsEntity obsByObsGroupId) {
        this.obsByObsGroupId = obsByObsGroupId;
    }

    public ObsEntity getObsByPreviousVersion() {
        return obsByPreviousVersion;
    }

    public void setObsByPreviousVersion(ObsEntity obsByPreviousVersion) {
        this.obsByPreviousVersion = obsByPreviousVersion;
    }
}
