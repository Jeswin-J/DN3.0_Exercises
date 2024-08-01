public class ConcreteWordDocument implements WordDocument{
    @Override
    public void openDocument() {
        System.out.println("Opening Word Document...");
    }

    @Override
    public void closeDocument() {
        System.out.println("Closing Word Document...");
    }

    @Override
    public void writeInfo() {
        System.out.println("Writing Information...");
    }
}
