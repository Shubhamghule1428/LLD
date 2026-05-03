// Concrete Product 3 - Excel Document
import java.util.ArrayList;
import java.util.List;

public class ExcelDocument implements Document {
    private String title;
    private String author;
    private List<String[]> rows;
    private int sheetCount;
    private boolean isOpen;
    
    public ExcelDocument(String title, String author) {
        this.title = title;
        this.author = author;
        this.rows = new ArrayList<>();
        this.sheetCount = 1;
        this.isOpen = false;
        System.out.println("Excel Document created: " + title);
    }
    
    @Override
    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Opening Excel document: " + title);
            System.out.println("Excel engine initialized");
        }
    }
    
    @Override
    public void addContent(String content) {
        if (isOpen) {
            // Parse CSV-like content
            String[] row = content.split(",");
            rows.add(row);
            System.out.println("Row added to Excel (Row " + rows.size() + ")");
        }
    }
    
    @Override
    public void save(String filename) {
        if (isOpen) {
            System.out.println("Saving Excel document...");
            System.out.println("Calculating formulas...");
            System.out.println("Compressing spreadsheet...");
            System.out.println("Excel saved as: " + filename + ".xlsx");
        }
    }
    
    @Override
    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Excel document closed: " + title);
        }
    }
    
    @Override
    public String getDocumentType() {
        return "EXCEL";
    }
    
    @Override
    public void displayMetadata() {
        System.out.println("\n=== Excel Document Metadata ===");
        System.out.println("Type: Microsoft Excel");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Sheets: " + sheetCount);
        System.out.println("Rows: " + rows.size());
    }
    
    public void addFormula(String cell, String formula) {
        System.out.println("Formula added to cell " + cell + ": " + formula);
    }
    
    public void addChart(String chartType) {
        System.out.println("Chart added: " + chartType);
    }
}
