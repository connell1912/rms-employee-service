package com.rms.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;


@Converter
public class deptConverter implements AttributeConverter<Department,Integer> {

    @Override
    public Integer convertToDatabaseColumn(Department attribute) {
            if (attribute == null)
                return null;
     
            switch (attribute) {
            case TRAINING:
                return 1;
     
            case STAGING:
                return 2;
     
            case QC:
                return 3;
     
            case RETENTION:
                return 4;
     
            case HR:
                return 5;
     
            default:
                throw new IllegalArgumentException(attribute + " not supported.");
            }
    }

    @Override
    public Department convertToEntityAttribute(Integer dbData) {
        if (dbData == null)
            return null;
 
        switch (dbData) {
        case 1:
            return Department.TRAINING;
        case 2:
            return Department.STAGING;
        case 3:
            return Department.QC;
 
        case 4:
            return Department.RETENTION;
        case 5:
            return Department.HR;
        default:
            throw new IllegalArgumentException(dbData + " not supported.");
        }
    }


}