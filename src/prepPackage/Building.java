package prepPackage;

public class Building {
    private double latitude;
    private double longitude;
    private double squareFootage;
    private String ownerName;

    public Building(double lat, double lng, double sqFootage, String ownerName) {
        latitude = lat;
        longitude = lng;
        squareFootage = sqFootage;
        this.ownerName = ownerName;
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

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Building{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", squareFootage=" + squareFootage +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
