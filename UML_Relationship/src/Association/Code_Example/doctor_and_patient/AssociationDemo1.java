package Association.Code_Example.doctor_and_patient;

public class AssociationDemo1 {

	public static void main(String[] args) {
		// Create doctors
		Doctor cardio = new Doctor("D001", "Dr. Smith", "Cardiologist");
		Doctor neuro = new Doctor("D002", "Dr. Jones", "Neurologist");

		// Create patients
		Patient patient1 = new Patient("P001", "John Doe", 45);
		Patient patient2 = new Patient("P002", "Jane Smith", 32);
		Patient patient3 = new Patient("P003", "Bob Wilson", 50);

		// Establish associations
		patient1.assignDoctor(cardio);
		patient1.assignDoctor(neuro); // Patient can have multiple doctors

		patient2.assignDoctor(cardio);
		patient3.assignDoctor(neuro);

		// Display relationships
		cardio.displayPatients();
		System.out.println();
		neuro.displayPatients();

		System.out.println("\nPatient 1's doctors:");
		for (Doctor doc : patient1.getDoctors()) {
			System.out.println("  - " + doc);
		}

		// Remove association
		patient1.removeDoctor(cardio);
		System.out.println("\nAfter removing Dr. Smith from Patient 1:");
		cardio.displayPatients();
	}
}
