package io.devmartynov.tmsAn10Java.l7.additional;

import io.devmartynov.tmsAn10Java.l7.additional.doctor.Doctor;

/**
 * Hospital
 */
public class Hospital {
    private Doctor surgeon;
    private Doctor dentist;
    private Doctor therapist;

    /**
     * Ctor.
     *
     * @param surgeon   surgeon
     * @param dentist   dentist
     * @param therapist therapist
     */
    public Hospital(Doctor surgeon, Doctor dentist, Doctor therapist) {
        this.surgeon = surgeon;
        this.dentist = dentist;
        this.therapist = therapist;
    }

    /**
     * Appoints doctor to patient.
     *
     * @param patient patient
     */
    public void appointDoctorTo(Patient patient) {
        Doctor doctor = therapist;
        TreatmentPlanCodeEnum code = patient.getTreatmentPlan().getCode();
        if (code == TreatmentPlanCodeEnum.ONE) {
            doctor = surgeon;
        } else if (code == TreatmentPlanCodeEnum.TWO) {
            doctor = dentist;
        }
        patient.setDoctor(doctor);
        patient.getDoctor().treat();
    }
}
