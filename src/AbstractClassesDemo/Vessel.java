package AbstractClassesDemo;

public abstract class Vessel {
    public int numberOfEngines;
    int numberOfHulls;
    String propulsionMechanism;
    String ownerName;
    boolean transportsGoods;

    // here, I am defining the constructor method
    public Vessel(int engines, int hulls, String propulsion, String owner, boolean goods) {
        numberOfEngines = engines;
        numberOfHulls = hulls;
        propulsionMechanism = propulsion;
        ownerName = owner;
        transportsGoods = goods;
    }

//    public Vessel(int numberOfEngines, int numberOfHulls, String propulsionMechanism, String ownerName, boolean transportsGoods) {
//        this.numberOfEngines = numberOfEngines;
//        this.numberOfHulls = numberOfHulls;
//        this.propulsionMechanism = propulsionMechanism;
//        this.ownerName = ownerName;
//        this.transportsGoods = transportsGoods;
//    }

    public double amountOfDieselConsumed() {
        if (this.numberOfEngines == 0 || this.propulsionMechanism == "wind") return 0;
        return this.numberOfEngines * 100;
    }

    // abstract methods cannot have a body nor braces, and they must end with a semicolon
    public abstract String moves();
}
