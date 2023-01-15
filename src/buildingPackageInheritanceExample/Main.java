package buildingPackageInheritanceExample;

public class Main {
    public static void main(String[] args) {
        Cottage cottage = new Cottage(45.67, 12.34, 360, "Bill", 13.9, 42, true);

//        System.out.println(cottage.cherryTreeMessage());

        TripleDecker trpd = new TripleDecker(89, 56, "Bill, again", 3300, .25);
        System.out.println(trpd.toString());
        // superclass (BuildingParent) toString() implementation:
//         Building {latitude=89.0, longitude=56.0, ownerName='Bill, again', squareFootage=3300.0, landArea=0.25}

        System.out.println(trpd.assessValue());

        Skyscraper trumpSky = new Skyscraper(11.1, 22.2, "Trump Towers", 45000000, 3, 120);
        System.out.println("The value of the new Trump Tower is " + trumpSky.assessValue());

        ApartmentBuilding aptBldg = new ApartmentBuilding(44.5, 67.9, "Bill the slumlord", 6700, 3.4, 99);
        System.out.println("Bill the slumlord's tax bill is: " + aptBldg.calculateTaxBill());

        Cottage cttg = new Cottage(11, 22, 34345, "Bill", 2343.2, 44, true);
//        System.out.println(cttg.ownerName); // cannot access a private field outside of the class; field owerName is in the Cottage class and cannot be printed/accessed outside of the Cottage class (in Main.java)
//        cttg.ownerName = "Part Johanson"; // example of reassigning a public field
//        System.out.println(cttg.ownerName);

        System.out.println("======= An example of an abstract class");
//        BuildingParent bldgPar = new BuildingParent(12, 23, "Bill", 4455, 78.9);
//        System.out.println(bldgPar.getLatitude());

    }
}
