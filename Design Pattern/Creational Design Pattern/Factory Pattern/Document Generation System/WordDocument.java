// Concrete Product 2 - Word Document
import java.util.ArrayList;
import java.util.List;

public class WordDocument implements Document {
    private StringBuilder content;
    private String title;
    private String author;
    private List<String> comments;
    private boolean isOpen;
    
    public WordDocument(String title, String author) {
        this.title = title;
        this.author = author;
        this.content = new StringBuilder();
        this.comments = new ArrayList<>();
        this.isOpen = false;
        System.out.println("Word Document created: " + title);
    }
    
    @Override
    public void open() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Opening Word document: " + title);
            System.out.println("Microsoft Word initialized");
        }
    }
    
    @Override
    public void addContent(String text) {
        if (isOpen) {
            content.append(text).append("\n");
            System.out.println("Content added to Word document");
        }
    }
    
    @Override
    public void save(String filename) {
        if (isOpen) {
            System.out.println("Saving Word document...");
            System.out.println("Applying formatting...");
            System.out.println("Creating .docx structure...");
            System.out.println("Word document saved as: " + filename + ".docx");
        }
    }
    
    @Override
    public void close() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Word document closed: " + title);
        }
    }
    
    @Override
    public String getDocumentType() {
        return "WORD";
    }
    
    @Override
    public void displayMetadata() {
        System.out.println("\n=== Word Document Metadata ===");
        System.out.println("Type: Microsoft Word");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Comments: " + comments.size());
        System.out.println("Word Count: " + content.toString().split("\\s+").length);
    }
    
    public void addComment(String comment) {
        comments.add(comment);
        System.out.println("Comment added to Word document");
    }
    
    public void trackChanges(boolean enable) {
        System.out.println("Track changes: " + (enable ? "enabled" : "disabled"));
    }
}
