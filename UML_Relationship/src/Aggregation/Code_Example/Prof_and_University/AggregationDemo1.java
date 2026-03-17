package Aggregation.Code_Example.Prof_and_University;

public class AggregationDemo1 {

	public static void main(String[] args) {
        // Professors exist independently
        Professor prof1 = new Professor("P001", "Dr. Alan Turing", "Computer Science", 120000);
        Professor prof2 = new Professor("P002", "Dr. Ada Lovelace", "Mathematics", 115000);
        Professor prof3 = new Professor("P003", "Dr. Grace Hopper", "Computer Science", 125000);
        
        // Create universities
        University mit = new University("MIT", "Cambridge, MA", 1861);
        University stanford = new University("Stanford", "Stanford, CA", 1885);
        
        // Aggregation - universities hire existing professors
        mit.hireProfessor(prof1);
        mit.hireProfessor(prof2);
        stanford.hireProfessor(prof3);
        
        mit.displayFaculty();
        stanford.displayFaculty();
        
        // Fire professor - professor still exists
        System.out.println("\n--- Firing Professor ---");
        mit.fireProfessor(prof1);
        
        // Professor can still function independently
        prof1.teach("Algorithms");
        prof1.research("Artificial Intelligence");
        
        // Professor can join another university
        stanford.hireProfessor(prof1);
        
        stanford.displayFaculty();
        
        // Even if university is destroyed, professors exist
        System.out.println("\n--- University Closed ---");
        mit = null; // MIT closed
        System.out.println("MIT closed, but professors still exist:");
        System.out.println(prof2 + " is still active");
        prof2.teach("Discrete Mathematics");
    }
}
