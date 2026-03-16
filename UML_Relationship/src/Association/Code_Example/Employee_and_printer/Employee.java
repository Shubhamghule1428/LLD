package Association.Code_Example.Employee_and_printer;

public class Employee {

	private String employeeId;
	private String name;
	private String department;
	private Printer assignedPrinter; // Unidirectional association

	public Employee(String employeeId, String name, String department) {
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
	}

	public void assignPrinter(Printer printer) {
		this.assignedPrinter = printer;
		System.out.println(name + " assigned to printer: " + printer.getModel());
	}

	public void printDocument(String documentName, int pages) {
		if (assignedPrinter == null) {
			System.out.println("No printer assigned to " + name);
			return;
		}

		System.out.println(name + " is printing...");
		assignedPrinter.print(documentName, pages);
	}

	public String getName() {
		return name;
	}

	public String getEmployeeId() {
		return employeeId;
	}
}
