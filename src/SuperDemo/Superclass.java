package SuperDemo;

public class Superclass {

    public void printMethod() {
        System.out.println("Printed in Superclass.");
    }

    public static void main(String[] args) {
        Subclass sc = new Subclass();
        sc.printMethod();
    }
}


