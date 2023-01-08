package buildingPackageInheritanceExample;

public class Cottage {
    private double latitude;
    private double longitude;
    private double squareFootage;
    private String ownerName;
    private double landArea;
    private int numberOfCherryTrees;
    private boolean hasSauna;

    public Cottage(double lat, double lng, double sqFootage, String ownerName, double landArea, int numCherryTrees, boolean hasSauna) {
        latitude = lat;
        longitude = lng;
        squareFootage = sqFootage;
        this.ownerName = ownerName;
        this.landArea = landArea;
        numberOfCherryTrees = numCherryTrees;
        this.hasSauna = hasSauna;
    }

    // methods go here
    public String cherryTreeMessage() {
        return "I love cherries. I have " + this.numberOfCherryTrees + " cherry trees in my yard at the cottage.";
    }
}
