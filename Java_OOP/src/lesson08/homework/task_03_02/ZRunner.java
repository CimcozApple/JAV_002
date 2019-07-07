package lesson08.homework.task_03_02;

import java.util.ArrayList;

/*
 * Task 2
 * */
public class ZRunner {
    public static void main(String[] args) {
        Patients patients = new Patients();

        patients.addPatient(new Patient("Morinchik", "Danny", "D", "Kiev", 3332211, 0345, "Good"));
        patients.addPatient(new Patient("Brook", "Barbie", "Big D", "New York", 5551133, 0346, "Good"));
        patients.addPatient(new Patient("Voron", "Jack", "B", "San Francisco", 6661122, 0347, "Good"));

        ArrayList<Patient> patient = patients.getPatient();
        System.out.println("BEFORE\n" + patient);

//        patient.sort();

    }
}