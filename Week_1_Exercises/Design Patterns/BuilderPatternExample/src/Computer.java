public class Computer {
    private final String CPU;
    private final String RAM;
    private final String STORAGE;
    private final ComputerType type;


    public Computer(String cpu, String ram, String storage, ComputerType type) {
        this.CPU = cpu;
        this.RAM = ram;
        this.STORAGE = storage;
        this.type = type;
    }

    public String getCPU(){
        return this.CPU;
    }

    public String getRAM(){
        return this.RAM;
    }

    public String getSTORAGE(){
        return this.STORAGE;
    }

    public ComputerType getType() {
        return this.type;
    }
}
