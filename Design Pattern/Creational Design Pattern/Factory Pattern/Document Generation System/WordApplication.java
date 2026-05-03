// Concrete Creator 2 - Word Application
public class WordApplication extends Application {
    public WordApplication() {
        super("Microsoft Word");
    }
    
    @Override
    public Document createDocument(String title, String author) {
        return new WordDocument(title, author);
    }
}
