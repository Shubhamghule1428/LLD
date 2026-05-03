// Concrete Creator 1 - PDF Application
public class PDFApplication extends Application {
    public PDFApplication() {
        super("Adobe PDF Creator");
    }
    
    @Override
    public Document createDocument(String title, String author) {
        return new PDFDocument(title, author);
    }
}
