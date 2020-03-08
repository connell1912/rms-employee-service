package com.rms.model;

public enum Title {
    TRAINING_MANAGER, STAGING_MANAGER, HR_LEAD, TRAINING_LEAD;

    public static Title convertStringToEnum(String type) {
        switch (type) {
            case "TRAINING_MANAGER":
                return Title.TRAINING_MANAGER;
            case "STAGING_MANAGER":
                return Title.STAGING_MANAGER;
            case "HR_LEAD":
                return Title.HR_LEAD;
            case "TRAINING_LEAD":
                return Title.TRAINING_LEAD;
            default:
                return null;
        }
    }
}
