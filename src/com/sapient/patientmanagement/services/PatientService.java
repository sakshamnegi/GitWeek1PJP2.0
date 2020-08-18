package com.sapient.patientmanagement.services;

import com.sapient.patientmanagement.models.Patient;

public interface PatientService {

	public String addPatient(Patient p);

	public String getPatientDetails(String id);
}
