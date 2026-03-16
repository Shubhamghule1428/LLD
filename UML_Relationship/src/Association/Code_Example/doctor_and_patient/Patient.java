package Association.Code_Example.doctor_and_patient;

import java.util.ArrayList;
import java.util.List;

public class Patient {

	private String patientId;
    private String name;
    private int age;
    private String disease;
    private List<Doctor> doctors; // Association - Patient knows doctors
    
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }
    
    // Associate with doctor
    public void assignDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Maintain bidirectional relationship
        }
    }
    
    public void removeDoctor(Doctor doctor) {
        doctors.remove(doctor);
        doctor.removePatient(this);
    }
    
    public List<Doctor> getDoctors() {
        return new ArrayList<>(doctors); // Return copy for encapsulation
    }
    
    // Getters
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    
    @Override
    public String toString() {
        return "Patient{" + name + ", ID: " + patientId + "}";
    }
}
