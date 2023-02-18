package ReferenceVersusValue.ReferenceVersusValueEquality;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Cheeseburger peekoniBurger = new Cheeseburger("Vosu Burger", 8.00, true, true);
        Cheeseburger SillBurger = new Cheeseburger("SillBurger", 12.99, false, true);

        System.out.println("Printing out the object memory locations:");
        System.out.println(peekoniBurger);
        System.out.println(SillBurger);
        if (peekoniBurger != SillBurger) {
            System.out.println("These two objects have different memory locations");
        }

        System.out.println("============ McDonald's ============");

        System.out.println("Let's look at two objects being the 'same' for all intents and purposes:");
        Cheeseburger mac = new Cheeseburger("McDonald's", 4.5, false, true);
        Cheeseburger mac2 = new Cheeseburger("McDonald's", 4.5, false, false);

        if (mac != mac2) {
            System.out.println("These two objects have different memory locations");
        }

        if (mac.equals(mac2)) {
            System.out.println("These two burgers " + mac.toString() + " and " + mac2.toString() + " are semantically equal (they have the same state/data/values).");
        }

        System.out.println("======== Let's talk about strings and primitives, baby ========");
        int favoriteNumber = 13;
        int favNumber = 13;
        System.out.println(favoriteNumber == favNumber);
//        System.out.println(favNumber.equals(favoriteNumber)); // compiler error; only objects have the .equals() method; primitives do not

        String myName = "Bill";
        String firstName = "Bill";
        System.out.println(myName == firstName); // true, they have the place in memory

        String ArabFirstName = "Ahmed";
        String ArabLastName = "A";
        ArabLastName += "hmed";
        System.out.println("do these strings have the same memory location? ");
        System.out.println(ArabFirstName == ArabLastName);
        System.out.println("Are these two strings equal?");
        System.out.println(ArabFirstName.equals(ArabLastName));

        System.out.println("======== integer comparison ========");
        int a = 10;
        int b = 15;
        System.out.println(a == b);

        int c = 10;
        System.out.println(a == c);

        int d = a;
        System.out.println(a == d);
        System.out.println("a: " + a);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}
