public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document.");
    }
    public void close() {
        System.out.println("Closing a Word document.\n");
    }

    public String getFileType() {
        return "Word Document";
    }
}
