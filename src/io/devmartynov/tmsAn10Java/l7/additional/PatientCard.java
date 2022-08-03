package io.devmartynov.tmsAn10Java.l7.additional;

import io.devmartynov.tmsAn10Java.l7.additional.doctor.Doctor;

/**
 * Patient card
 */
public class PatientCard {
    private Patient patient;
    private Doctor doctor;

    /**
     * Ctor.
     *
     * @param patient patient
     * @param doctor  doctor
     */
    public PatientCard(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    /**
     * Patient
     * @return patient
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Doctor
     * @return doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }
}
