package AdapterPattern;

public class Client {

    public void printClient(Printer printer){
        printer.print();
    }

    public static void main(String[] args) {
        Printer printerAdapter = new PrinterAdapter();
        new Client().printClient(printerAdapter);
    }
}
