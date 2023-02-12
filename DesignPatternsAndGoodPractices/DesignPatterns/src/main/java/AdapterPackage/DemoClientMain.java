package AdapterPackage;

public class DemoClientMain {
    public static void main(String[] args) {
        RoundHole rHole = new RoundHole(13);
        RoundPeg rPeg = new RoundPeg(14);
        if (rHole.fits(rPeg)) {
            System.out.println("Round peg with radius " + rPeg.getRadius() + " fits hole with radius " + rHole.getRadius());
        } else {
            System.out.println("Round peg with radius " + rPeg.getRadius() + " does not fit hole with radius " + rHole.getRadius());
        }

        // service objects
        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        // adapter objects
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSquarePeg);

        if (rHole.fits(smallSqPegAdapter)) System.out.println("Square peg with width " + smallSquarePeg.getWidth() + " fits round hole with radius " + rHole.getRadius());

        if (!rHole.fits(largeSqPegAdapter)) System.out.println("Square peg with width " + largeSquarePeg.getWidth() + " does not fit round hole with radius " + rHole.getRadius());
    }
}
