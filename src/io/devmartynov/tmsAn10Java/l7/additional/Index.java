package io.devmartynov.tmsAn10Java.l7.additional;

import io.devmartynov.tmsAn10Java.l7.additional.doctor.*;

/*
    Создать программу для имитации работы клиники.
    Пусть в клинике будет три врача: хирург, терапевт и дантист.
    Каждый врач имеет метод «лечить», но каждый врач лечит по-своему.
    Так же предусмотреть класс «Пациент» и класс «План лечения».
    Создать объект класса «Пациент» и добавить пациенту план лечения.
    Так же создать метод, который будет назначать врача пациенту согласно плану лечения.
    Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
    Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
    Если план лечения имеет любой другой код – назначить терапевта и выполнить метод лечить.
 */
public class Index {
    public static void main(String[] args) {
        Doctor surgeon = new Surgeon();
        Doctor dentist = new Dentist();
        Doctor therapist  = new Therapist();
        Doctor[] doctors = {surgeon, dentist, therapist};

        TreatmentPlan treatmentPlan = new TreatmentPlan(1);
        Patient patient = new Patient();
        patient.setTreatmentPlan(treatmentPlan);

        Hospital hospital = new Hospital(doctors);
        hospital.appointDoctorTo(patient);
        hospital.startTreatment(patient);
    }
}
