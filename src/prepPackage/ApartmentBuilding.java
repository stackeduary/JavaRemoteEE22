package prepPackage;

public class ApartmentBuilding extends Building {
    private int numberOfUnits;
    public ApartmentBuilding(double lat, double lng, double sqFootage, String ownerName, int numberOfUnits) {
        super(lat, lng, sqFootage, ownerName);
        this.numberOfUnits = numberOfUnits;
    }

    public String toString() {
        return "This building is located at " + getLatitude() + ", " + getLatitude() + " and is owned by " + getOwnerName();
    }
}
