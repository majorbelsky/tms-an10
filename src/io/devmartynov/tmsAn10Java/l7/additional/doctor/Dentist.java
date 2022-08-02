package io.devmartynov.tmsAn10Java.l7.additional.doctor;

/**
 * Dentist.
 */
public class Dentist extends Doctor {
    /**
     * Ctor.
     */
    public Dentist() {
        super(DoctorSpecializationEnum.DENTIST);
    }

    @Override
    public void treat() {
        System.out.println("Your tooth will be ok!");
    }
}
