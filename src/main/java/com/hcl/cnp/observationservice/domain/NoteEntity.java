package com.hcl.cnp.observationservice.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Tech Support on 8/7/2018.
 */
@Entity
@Table(name = "note")
public class NoteEntity {

    @Id
    @Column(name = "note_id")
    private Integer noteId;

    @Basic
    @Column(name = "note_type")
    private String noteType;

    @Basic
    @Column(name = "text")
    private String text;

    @Basic
    @Column(name = "priority")
    private Integer priority;

    @Basic
    @Column(name = "date_created")
    private Timestamp dateCreated;

    @Basic
    @Column(name = "date_changed")
    private Timestamp dateChanged;

    @Basic
    @Column(name = "uuid")
    private String uuid;

    @ManyToOne
    @JoinColumn(name = "obs_id", referencedColumnName = "obs_id")
    private ObsEntity obsByObsId;

    @ManyToOne
    @JoinColumn(name = "parent", referencedColumnName = "note_id")
    private NoteEntity noteByParent;

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public String getNoteType() {
        return noteType;
    }

    public void setNoteType(String noteType) {
        this.noteType = noteType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Timestamp getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(Timestamp dateChanged) {
        this.dateChanged = dateChanged;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoteEntity that = (NoteEntity) o;

        if (noteId != null ? !noteId.equals(that.noteId) : that.noteId != null) return false;
        if (noteType != null ? !noteType.equals(that.noteType) : that.noteType != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (priority != null ? !priority.equals(that.priority) : that.priority != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (dateChanged != null ? !dateChanged.equals(that.dateChanged) : that.dateChanged != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = noteId != null ? noteId.hashCode() : 0;
        result = 31 * result + (noteType != null ? noteType.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (priority != null ? priority.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (dateChanged != null ? dateChanged.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }

    public ObsEntity getObsByObsId() {
        return obsByObsId;
    }

    public void setObsByObsId(ObsEntity obsByObsId) {
        this.obsByObsId = obsByObsId;
    }

    public NoteEntity getNoteByParent() {
        return noteByParent;
    }

    public void setNoteByParent(NoteEntity noteByParent) {
        this.noteByParent = noteByParent;
    }
}
