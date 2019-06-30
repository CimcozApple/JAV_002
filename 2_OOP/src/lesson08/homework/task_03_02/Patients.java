package lesson08.homework.task_03_02;

import java.util.ArrayList;

public class Patients {
    ArrayList<Patient> patient = new ArrayList<>();

    public ArrayList<Patient> getPatient() {
        return patient;
    }

    public void addPatient(Patient patient) {
        this.patient.add(patient);
    }

    public Patient getPatient(int index) {
        return patient.get(index);
    }

    public void filterByN() {

    }










    @Override // переделать как в первом задании
    public String toString() {
        return "Patients{" +
                "patient = " + patient +
                '}';
    }
}