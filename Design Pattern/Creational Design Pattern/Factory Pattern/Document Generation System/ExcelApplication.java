// Concrete Creator 3 - Excel Application
public class ExcelApplication extends Application {
    public ExcelApplication() {
        super("Microsoft Excel");
    }
    
    @Override
    public Document createDocument(String title, String author) {
        return new ExcelDocument(title, author);
    }
}
