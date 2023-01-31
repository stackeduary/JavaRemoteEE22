package Adapters;

import Round.RoundPeg;
import Square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    // composition occurs here:
    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
