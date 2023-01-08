package buildingPackageInheritanceExample;

public class BuildingParent {
    private double taxRate;
    private double latitude;
    private double longitude;
    private String ownerName;
    private double squareFootage;
    private double landArea;

    public BuildingParent(double lat, double lng, String ownerName, double sqFootage, double landArea) {
        latitude = lat;
        longitude = lng;
        this.ownerName = ownerName;
        squareFootage = sqFootage;
        this.landArea = landArea;
    }

    public double assessValue() {
        return this.getSquareFootage() * 100;
    }

    public double calculateTaxBill() {
        return assessValue() * .04;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public double getLandArea() {
        return landArea;
    }

    public void setLandArea(double landArea) {
        this.landArea = landArea;
    }

    @Override
    public String toString() {
        return "Building {" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", ownerName='" + ownerName + '\'' +
                ", squareFootage=" + squareFootage +
                ", landArea=" + landArea +
                '}';
    }
}
