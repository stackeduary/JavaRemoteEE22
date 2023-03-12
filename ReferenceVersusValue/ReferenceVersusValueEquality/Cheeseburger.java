package ReferenceVersusValue.ReferenceVersusValueEquality;

import java.util.Objects;

public class Cheeseburger {
    private String restaurant;
    private double price;
    private boolean hasBacon;
    private boolean isDelicious;

    public Cheeseburger(String restaurant, double price, boolean hasBacon, boolean isDelicious) {
        this.restaurant = restaurant;
        this.price = price;
        this.hasBacon = hasBacon;
        this.isDelicious = isDelicious;
    }

//    @Override
//    public boolean equals(Object inputParam) {
//        if (this == inputParam) return true;
//        if (!(inputParam instanceof Cheeseburger that)) return false;
//        return Double.compare(that.price, price) == 0 && hasBacon == that.hasBacon && restaurant.equals(that.restaurant);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(restaurant, price, hasBacon);
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Cheeseburger that)) return false;
//        return Double.compare(that.price, price) == 0 && hasBacon == that.hasBacon && Objects.equals(restaurant, that.restaurant);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(restaurant, price, hasBacon);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cheeseburger that)) return false;
        return Double.compare(that.price, price) == 0 && hasBacon == that.hasBacon && isDelicious == that.isDelicious && restaurant.equals(that.restaurant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restaurant, price, hasBacon, isDelicious);
    }
}
