package prepPackage;

public class Skyscraper extends Building {
    private double height;

    public Skyscraper(double lat, double lng, double sqFootage, String ownerName, double bldgHeight) {
        super(lat, lng, sqFootage, ownerName);
        height = bldgHeight;
    }
}
