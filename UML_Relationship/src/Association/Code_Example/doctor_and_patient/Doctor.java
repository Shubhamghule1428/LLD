package Association.Code_Example.doctor_and_patient;

import java.util.ArrayList;
import java.util.List;

public class Doctor {

	private String doctorId;
    private String name;
    private String specialization;
    private List<Patient> patients; // Association - Doctor knows patients
    
    public Doctor(String doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }
    
    // Associate with patient
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }
    
    public void removePatient(Patient patient) {
        patients.remove(patient);
    }
    
    public List<Patient> getPatients() {
        return new ArrayList<>(patients);
    }
    
    public void displayPatients() {
        System.out.println("Dr. " + name + "'s patients:");
        for (Patient patient : patients) {
            System.out.println("  - " + patient.getName() + " (Age: " + patient.getAge() + ")");
        }
    }
    
    // Getters
    public String getDoctorId() { return doctorId; }
    public String getName() { return name; }
    public String getSpecialization() { return specialization; }
    
    @Override
    public String toString() {
        return "Doctor{" + name + ", " + specialization + "}";
    }
}
