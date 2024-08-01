public class Main {
    public static void main(String[] args) {

        DocumentFactory df;


        df = new ExcelDocumentFactory();

        ExcelDocument xlsx = (ExcelDocument) df.createDocument();
        xlsx.openDocument();
        xlsx.addTable();
        xlsx.closeDocument();
        System.out.println();


        df = new PdfDocumentFactory();

        PdfDocument pdf = (PdfDocument) df.createDocument();
        pdf.openDocument();
        pdf.signDocument();
        pdf.closeDocument();
        System.out.println();


        df = new WordDocumentFactory();

        WordDocument docs = (WordDocument) df.createDocument();
        docs.openDocument();
        docs.writeInfo();
        docs.closeDocument();
        System.out.println();
    }
}
