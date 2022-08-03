package io.devmartynov.tmsAn10Java.l7.additional;

import io.devmartynov.tmsAn10Java.l7.additional.doctor.Doctor;

/**
 * Patient
 */
public class Patient {
    private TreatmentPlan treatmentPlan;

    /**
     * Treatment plan
     *
     * @return treatment plan
     */
    public TreatmentPlan getTreatmentPlan() {
        return treatmentPlan;
    }

    /**
     * Sets treatment play
     *
     * @param treatmentPlan treatment plan
     */
    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
}
