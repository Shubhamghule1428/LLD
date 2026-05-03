// Product Interface
public interface Document {
    void open();
    void save(String filename);
    void close();
    void addContent(String content);
    String getDocumentType();
    void displayMetadata();
}
