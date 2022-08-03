package io.devmartynov.tmsAn10Java.l7.additional.doctor;

/**
 * Surgeon.
 */
public class Surgeon extends Doctor {

    /**
     * Ctor.
     */
    public Surgeon() {
        super(DoctorSpecializationEnum.SURGEON);
    }

    @Override
    public void treat() {
        System.out.println("I'm going to cutting your hand off.");
    }
}
