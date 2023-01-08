package prepPackage;

public class Main {
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper(78.1, 34.2, 4800, "Skyscraper, Inc.", 360);

        System.out.println(skyscraper.toString());

        ApartmentBuilding aptBldg = new ApartmentBuilding(89.11, 44.4, 2200, "Bill", 6);
        System.out.println(aptBldg.toString());

    }
}
