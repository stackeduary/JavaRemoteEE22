package buildingPackageInheritanceExample;

public class TripleDecker extends BuildingParent {

    public TripleDecker(double lat, double lng, String ownerName, double sqFootage, double landArea) {
        super(lat, lng, ownerName, sqFootage, landArea);
    }

    // demonstrate method overriding: a different implementation of a method that comes from a parent
    // the subclass implements this method differently from how it is implemented in the superclass
    public String toString() {
        return "The triple decker at " + this.getLatitude() + " degrees latitude, " + this.getLongitude() + " degrees longitude is " + getSquareFootage() + " square feet, is owned by the esteemed and worldly " + this.getOwnerName() + " and sits on " + getLandArea() + " acres.";
    }

    public double assessValue() {
        return this.getSquareFootage() * 85; // there are more people living on the same land area
    }

    public double calculateTaxBill() {
        return assessValue() * .025;
    }
}
