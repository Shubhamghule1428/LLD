package Association.Code_Example.Employee_and_printer;

public class Printer {

	private String printerId;
	private String model;
	private String status;
	private int pagesRemaining;

	public Printer(String printerId, String model) {
		this.printerId = printerId;
		this.model = model;
		this.status = "Ready";
		this.pagesRemaining = 500;
	}

	public boolean print(String document, int pages) {
		if (!status.equals("Ready")) {
			System.out.println("Printer not ready. Status: " + status);
			return false;
		}

		if (pagesRemaining < pages) {
			System.out.println("Not enough paper. Available: " + pagesRemaining);
			status = "Out of Paper";
			return false;
		}

		System.out.println("Printing: " + document);
		System.out.println("Pages: " + pages);
		pagesRemaining -= pages;
		return true;
	}

	public String getStatus() {
		return status;
	}

	public String getModel() {
		return model;
	}

	public int getPagesRemaining() {
		return pagesRemaining;
	}
}
