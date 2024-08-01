public class ConcretePdfDocument implements PdfDocument{

    @Override
    public void signDocument() {
        System.out.println("Signing Document...");
    }

    @Override
    public void openDocument() {
        System.out.println("Opening PDF Document...");
    }

    @Override
    public void closeDocument() {
        System.out.println("Closing PDF Document...");
    }
}
