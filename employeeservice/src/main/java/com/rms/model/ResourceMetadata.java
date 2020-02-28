package com.rms.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * some metadata
 * 
 * @autho jojo
 */
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceMetadata {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int resourceId;
    private int resourceCreator;
    @CreationTimestamp
    private Timestamp resourceCreationDate;
    private int lastModifier;
    @CreationTimestamp
    private Timestamp lastModifiedDateTime;
    private int resourceOwner;

    public ResourceMetadata(int resourceCreator, Timestamp resourceCreationDate, int lastModifier,
            Timestamp lastModifiedDateTime, int resourceOwner) {
        this.resourceCreator = resourceCreator;
        this.resourceCreationDate = resourceCreationDate;
        this.lastModifier = lastModifier;
        this.lastModifiedDateTime = lastModifiedDateTime;
        this.resourceOwner = resourceOwner;
    }

}