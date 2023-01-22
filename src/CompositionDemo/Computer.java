package CompositionDemo;

public class Computer {
    private String name;
    private Processor processor;
    private Ram ram;

    public Computer(String name, Processor processor, Ram ram) {
        this.name = name;
        this.processor = processor;
        this.ram = ram;
    }

    public void run() {
//        if (this.processor.name.charAt(0) == 'a') System.out.println("hi");
        System.out.println(this.name + " has a " + this.processor.name + " chip with " + this.processor.numberOfCores + " cores, and " + this.ram.size + " GB of RAM from " + this.ram.name);
    }

    public static void main(String[] args) {
        Computer computer = new Computer("Bill's sleek new laptop", new Processor("Intel", 4), new Ram("Taiwanese Chip Manufacturing Co. Ltd.", 64));
        computer.run();
    }
}

class Processor {
    String name;
    int numberOfCores;

    public Processor(String name, int numberOfCores) {
        this.name = name;
        this.numberOfCores = numberOfCores;
    }
}

class Ram {
    String name;
    int size;

    public Ram(String name, int size) {
        this.name = name;
        this.size = size;
    }
}