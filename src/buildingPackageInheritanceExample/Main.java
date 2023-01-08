package buildingPackageInheritanceExample;

public class Main {
    public static void main(String[] args) {
        Cottage cottage = new Cottage(45.67, 12.34, 360, "Bill", 13.9, 42, true);

//        System.out.println(cottage.cherryTreeMessage());

        TripleDecker trpd = new TripleDecker(89, 56, "Bill, again", 3300, .25);
        System.out.println(trpd.toString());
        // superclass (BuildingParent) toString() implementation:
        // Building {latitude=89.0, longitude=56.0, ownerName='Bill, again', squareFootage=3300.0, landArea=0.25}

        Skyscraper trumpSky = new Skyscraper(11.1, 22.2, "Trump Towers", 45000000, 3, 120);
        System.out.println("The value of the new Trump Tower is " + trumpSky.assessValue());

        System.out.println(trpd.assessValue());
    }
}
