// Concrete Product 1 - PDF Document
public class PDFDocument implements Document {
    private StringBuilder content;
    private String title;
    private String author;
    private int pageCount;
    private boolean isOpen;
    
    public PDFDocument(String title, String author) {
        this.title = title;
        this.author = author;
        this.content = new StringBuilder();
        this.pageCount = 1;
        this.isOpen = false;
        System.out.println("PDF Document created: " + title);
    }
    
    @Override
    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Opening PDF document: " + title);
            System.out.println("PDF Reader initialized");
        }
    }
    
    @Override
    public void addContent(String text) {
        if (isOpen) {
            content.append(text).append("\n");
            // Calculate pages (500 chars per page)
            pageCount = (content.length() / 500) + 1;
            System.out.println("Content added to PDF (Page " + pageCount + ")");
        } else {
            System.out.println("Error: Document not open");
        }
    }
    
    @Override
    public void save(String filename) {
        if (isOpen) {
            System.out.println("Saving PDF document...");
            System.out.println("Compressing content...");
            System.out.println("Embedding fonts...");
            System.out.println("PDF saved as: " + filename + ".pdf");
            System.out.println("File size: " + (content.length() / 1024) + " KB");
        }
    }
    
    @Override
    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("PDF document closed: " + title);
        }
    }
    
    @Override
    public String getDocumentType() {
        return "PDF";
    }
    
    @Override
    public void displayMetadata() {
        System.out.println("\n=== PDF Document Metadata ===");
        System.out.println("Type: PDF");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pageCount);
        System.out.println("Content Length: " + content.length() + " characters");
    }
    
    public void setPassword(String password) {
        System.out.println("PDF password protection enabled");
    }
}
