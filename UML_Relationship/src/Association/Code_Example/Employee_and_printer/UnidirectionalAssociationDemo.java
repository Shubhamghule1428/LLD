package Association.Code_Example.Employee_and_printer;

public class UnidirectionalAssociationDemo {

	public static void main(String[] args) {
		// Create printer (doesn't know about employees)
		Printer printer = new Printer("P001", "HP LaserJet");

		// Create employees
		Employee emp1 = new Employee("E001", "Alice", "IT");
		Employee emp2 = new Employee("E002", "Bob", "HR");

		// Employees use printer (unidirectional - employee knows printer)
		emp1.assignPrinter(printer);
		emp2.assignPrinter(printer);

		// Use printer
		emp1.printDocument("Report.pdf", 10);
		emp2.printDocument("Invoice.pdf", 5);

		System.out.println("\nPrinter status: " + printer.getStatus());
		System.out.println("Pages remaining: " + printer.getPagesRemaining());
	}
}
