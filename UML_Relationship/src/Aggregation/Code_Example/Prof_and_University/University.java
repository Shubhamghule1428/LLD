package Aggregation.Code_Example.Prof_and_University;

import java.util.ArrayList;
import java.util.List;

public class University {

	private String name;
	private String location;
	private int established;
	private List<Professor> professors; // Aggregation - university has professors

	public University(String name, String location, int established) {
		this.name = name;
		this.location = location;
		this.established = established;
		this.professors = new ArrayList<>();
	}

	// Hire existing professor (aggregation - not creating new)
	public void hireProfessor(Professor professor) {
		if (!professors.contains(professor)) {
			professors.add(professor);
			System.out.println(name + " hired " + professor.getName());
		}
	}

	// Fire professor (professor still exists independently)
	public void fireProfessor(Professor professor) {
		if (professors.remove(professor)) {
			System.out.println(name + " fired " + professor.getName());
			System.out.println(professor.getName() + " still exists and can work elsewhere");
		}
	}

	public List<Professor> getProfessors() {
		return new ArrayList<>(professors);
	}

	public void displayFaculty() {
		System.out.println("\n" + name + " Faculty:");
		System.out.println("Total Professors: " + professors.size());
		for (Professor prof : professors) {
			System.out.println("  - " + prof);
		}
	}

	public String getName() {
		return name;
	}
}
	