public class ConcreteExcelDocument implements ExcelDocument{
    @Override
    public void addTable() {
        System.out.println("Adding new Table...");
    }

    @Override
    public void openDocument() {
        System.out.println("Opening Excel Document...");
    }

    @Override
    public void closeDocument() {
        System.out.println("Closing Excel Document...");

    }
}
