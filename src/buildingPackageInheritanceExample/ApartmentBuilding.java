package buildingPackageInheritanceExample;

public class ApartmentBuilding extends BuildingParent {
    private int numberOfUnits;
    public ApartmentBuilding(double lat, double lng, String ownerName, double sqFootage, double landArea, int numberOfUnits) {
        super(lat, lng, ownerName, sqFootage, landArea);
        this.numberOfUnits = numberOfUnits;
    }

    public String toString() {
        return "This building is located at " + getLatitude() + ", " + getLatitude() + " and is owned by " + getOwnerName();
    }
}
