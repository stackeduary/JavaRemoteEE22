package AbstractClassesDemo;

public class Main {
    public static void main(String[] args) {
//        Vessel vssl = new Vessel(12, 1, "diesel engine", "Tallink", true);
//        System.out.println(vssl.numberOfEngines);
//        System.out.println(vssl.amountOfDieselConsumed());

        Sailboat sailboat = new Sailboat(1, 2, "wind", "Larry Ellison", false);
        System.out.println(sailboat.amountOfDieselConsumed());
        System.out.println(sailboat.moves());
    }
}
