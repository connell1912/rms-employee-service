package com.rms.model;

public enum Department {

	TRAINING, STAGING, QC, RETENTION, HR, ADMIN;

	public static Department convertStringToEnum(String type) {
		switch (type) {
			case "TRAINING":
				return Department.TRAINING;
			case "STAGING":
				return Department.STAGING;
			case "QC":
			return Department.QC;
			case "RETENTION":
			return Department.RETENTION;
			case "HR":
				return Department.HR;
			case "ADMIN":
				return Department.ADMIN;
			default:
				return null;
		}
	}
}
