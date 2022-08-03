package io.devmartynov.tmsAn10Java.l7.additional;

import io.devmartynov.tmsAn10Java.l7.additional.doctor.Doctor;

/**
 * Hospital
 */
public class Hospital {
    private Doctor[] doctors;
    private PatientCard[] patientCards;

    /**
     * Ctor.
     *
     * @param doctors doctors
     */
    public Hospital(Doctor[] doctors) {
        this.doctors = doctors;
        patientCards = new PatientCard[0];
    }

    /**
     * Appoints doctor to patient.
     *
     * @param patient patient
     */
    public void appointDoctorTo(Patient patient) {
        PatientCard patientCard = new PatientCard(
            patient,
            findDoctor(patient.getTreatmentPlan().getCode())
        );
        Array<PatientCard> array = new Array<>(patientCards);
        array.addElement(patientCard);
        patientCards = (PatientCard[]) array.getValue();
    }

    /**
     * Finds doctor by treatment code
     *
     * @param treatmentCode code
     * @return found doctor
     */
    private Doctor findDoctor(int treatmentCode) {
        Doctor doctor = doctors[2];
        if (treatmentCode == 1) {
            doctor = doctors[0];
        } else if (treatmentCode == 2) {
            doctor = doctors[1];
        }
        return doctor;
    }

    /**
     * Finds patient card
     *
     * @param patient patient
     * @return patient card if found otherwise null
     */
    private PatientCard findPatientCard(Patient patient) {
        for (PatientCard patientCard : patientCards) {
            if (patientCard.getPatient().equals(patient)) {
                return patientCard;
            }
        }
        return null;
    }

    /**
     * Starts patient treatment
     * Creates new patient card if hospital hasn't the one
     * @param patient patient
     */
    public void startTreatment(Patient patient) {
        PatientCard patientCard = findPatientCard(patient);
        if (patientCard == null) {
            appointDoctorTo(patient);
            startTreatment(patient);
        } else {
            patientCard.getDoctor().treat();
        }
    }
}
