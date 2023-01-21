package AbstractClassesDemo;

public class Sailboat extends Vessel {

    public Sailboat(int engines, int hulls, String propulsion, String owner, boolean goods) {
        super(engines, hulls, propulsion, owner, goods);
    }

    // subclasses that extend an abstract class that has an abstract method must define the abstract method, i.e., the subclass must have a method body for the abstract method it is inheriting
    public String moves() {
        return "I am sailing! Woooooo!!!!!";
    }

}
