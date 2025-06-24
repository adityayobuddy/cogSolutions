public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document.");
    }
    public void close() {
        System.out.println("Closing a PDF document.\n");
    }
    
    public String getFileType() {
        return "PDF Document";
    }
}
