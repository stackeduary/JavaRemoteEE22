package Adapters;

import Round.*;
import Square.SquarePeg;

// this is the client class
public class AdapterDemo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        // wrapping occurs here:
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2, with length " + smallSqPeg.getWidth() + ", fits round hole r5, with width " + hole.getRadius() + ".");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20, with width " + largeSqPeg.getWidth() + ", does not fit into round hole r5, with width " + hole.getRadius() + ".");
        }
    }
}
