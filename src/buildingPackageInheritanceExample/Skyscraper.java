package buildingPackageInheritanceExample;

public class Skyscraper extends BuildingParent {

    private int numberOfFloors;

    public Skyscraper(double lat, double lng, String ownerName, double sqFootage, double landArea, int numFloors) {
        super(lat, lng, ownerName, sqFootage, landArea);
        numberOfFloors = numFloors; // only have to add the field specific to the child class; the common fields are pulled in from the parent with the super() method
    }
}
