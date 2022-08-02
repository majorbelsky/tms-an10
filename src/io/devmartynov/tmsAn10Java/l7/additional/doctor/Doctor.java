package io.devmartynov.tmsAn10Java.l7.additional.doctor;

/**
 * Doctor
 */
public class Doctor {
    private DoctorSpecializationEnum specialization;

    /**
     * Ctor.
     *
     * @param specialization specialization
     */
    public Doctor(DoctorSpecializationEnum specialization) {
        this.specialization = specialization;
    }

    /**
     * Doctor specialization
     *
     * @return doctor specialization
     */
    public DoctorSpecializationEnum getSpecialization() {
        return specialization;
    }

    /**
     * Treats patient
     */
    public void treat() {
        System.out.println("Treatment...");
    }
}
