package com.rms.model;

import java.sql.Timestamp;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

/**
 * some metadata
 * 
 * @autho jojo
 */
@Entity
@Table
public class ResourceMetadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resourceId;
    private int resourceCreator;
    @CreationTimestamp
    private Timestamp resourceCreationDate;
    private String lastModifier;
    @CreationTimestamp
    private String lastModifiedDateTime;
    private int resourceOwner;

    public ResourceMetadata() {
    }

    public ResourceMetadata(int resourceCreator, Timestamp resourceCreationDate, String lastModifier,
            String lastModifiedDateTime, int resourceOwner) {
        this.resourceCreator = resourceCreator;
        this.resourceCreationDate = resourceCreationDate;
        this.lastModifier = lastModifier;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.resourceOwner = resourceOwner;
    }

    public int getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getResourceCreator() {
        return this.resourceCreator;
    }

    public void setResourceCreator(int resourceCreator) {
        this.resourceCreator = resourceCreator;
    }

    public Timestamp getResourceCreationDate() {
        return this.resourceCreationDate;
    }

    public void setResourceCreationDate(Timestamp resourceCreationDate) {
        this.resourceCreationDate = resourceCreationDate;
    }

    public String getLastModifier() {
        return this.lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    public String getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    public void setLastModifiedDateTime(String lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
    }

    public int getResourceOwner() {
        return this.resourceOwner;
    }

    public void setResourceOwner(int resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    @Override
    public String toString() {
        return "{" + " resourceId='" + getResourceId() + "'" + ", resourceCreator='" + getResourceCreator() + "'"
                + ", resourceCreationDate='" + getResourceCreationDate() + "'" + ", lastModifier='" + getLastModifier()
                + "'" + ", lastModifiedDateTime='" + getLastModifiedDateTime() + "'" + ", resourceOwner='"
                + getResourceOwner() + "'" + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ResourceMetadata)) {
            return false;
        }
        ResourceMetadata resourceMetadata = (ResourceMetadata) o;
        return resourceId == resourceMetadata.resourceId && resourceCreator == resourceMetadata.resourceCreator
                && Objects.equals(resourceCreationDate, resourceMetadata.resourceCreationDate)
                && Objects.equals(lastModifier, resourceMetadata.lastModifier)
                && Objects.equals(lastModifiedDateTime, resourceMetadata.lastModifiedDateTime)
                && resourceOwner == resourceMetadata.resourceOwner;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceCreator, resourceCreationDate, lastModifier, lastModifiedDateTime,
                resourceOwner);
    }

}