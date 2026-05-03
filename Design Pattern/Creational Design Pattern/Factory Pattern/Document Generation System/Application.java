// Creator (Abstract)
public abstract class Application {
    protected String applicationName;
    
    public Application(String applicationName) {
        this.applicationName = applicationName;
    }
    
    // Factory Method
    public abstract Document createDocument(String title, String author);
    
    // Template method that uses factory method
    public void newDocument(String title, String author, String[] content) {
        System.out.println("\n==================================================");
        System.out.println("Application: " + applicationName);
        
        // Create document using factory method
        Document doc = createDocument(title, author);
        
        doc.open();
        
        // Add content
        for (String line : content) {
            doc.addContent(line);
        }
        
        doc.displayMetadata();
        doc.save(title.replaceAll("\\s+", "_"));
        doc.close();
        
        System.out.println("==================================================");
    }
}
