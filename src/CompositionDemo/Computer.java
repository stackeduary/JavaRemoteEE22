package CompositionDemo;

public class Computer {
    private String name;
    private Processor prcssr;
    private RAM ram;

    public Computer(String name, Processor prcssr, RAM ram) {
        this.name = name;
        this.prcssr = prcssr;
        this.ram = ram;
    }

    public void run() {
        System.out.println(this.name + " has an " + this.prcssr.name + " chip with " + this.prcssr.numberOfCores + " cores, and " + this.ram.size + " GB of RAM from " + this.ram.name + ".");
    }

    public static void main(String[] args) {
        Computer HPLaptop = new Computer("SleekHPLaptop", new Processor("Intel", 4), new RAM("Taiwanese Chip Manufacturing Co. Ltd.", 64));
        HPLaptop.run();
        Computer OlgaPC = new Computer("HP Omen", new Processor("Intel", 7), new RAM("HyperX", 16));
        OlgaPC.run();
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

class RAM {
    String name;
    int size;

    public RAM (String name, int size) {
        this.name = name;
        this.size = size;
    }
}
