package io.devmartynov.tmsAn10Java.l7.additional;

import io.devmartynov.tmsAn10Java.l7.additional.doctor.Doctor;

/**
 * Patient
 */
public class Patient {
    private TreatmentPlan treatmentPlan;
    private Doctor doctor;

    /**
     * Doctor
     *
     * @return doctor
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Treatment plan
     *
     * @return treatment plan
     */
    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    /**
     * Sets doctor
     *
     * @param doctor doctor
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * Sets treatment play
     * @param treatmentPlan treatment plan
     */
    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}
