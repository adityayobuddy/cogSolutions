public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel document.");
    }
    public void close() {
        System.out.println("Closing an Excel document.\n");
    }
    public String getFileType() {
        return "Excel Document";
    }
}
