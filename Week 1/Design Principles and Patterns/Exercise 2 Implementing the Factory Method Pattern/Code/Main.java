public class Main {
    public static void main(String[] args) {
        // Word
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        System.out.println(word.getFileType());
        word.open();
        word.close();

        // pdf
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        System.out.println(pdf.getFileType());
        pdf.open();
        pdf.close();

        // Excel
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        System.out.println(excel.getFileType());
        excel.open();
        excel.close();
    }
}
