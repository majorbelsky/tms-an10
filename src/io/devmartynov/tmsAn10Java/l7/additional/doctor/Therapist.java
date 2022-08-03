package io.devmartynov.tmsAn10Java.l7.additional.doctor;

/**
 * Therapist.
 */
public class Therapist extends Doctor {

    /**
     * Ctor.
     */
    public Therapist() {
        super(DoctorSpecializationEnum.THERAPIST);
    }

    @Override
    public void treat() {
        System.out.println("I am referring you to another doctor:)");
    }
}
