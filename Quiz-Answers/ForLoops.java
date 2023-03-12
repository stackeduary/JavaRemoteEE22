// Quiz 8
// Saturday, Mar. 4, 2023

import java.util.ArrayList;

public class ForLoops {
    public static void main(String[] args) {
        // part I: general for-loop
        System.out.println("======== general for-loop ========");
        ArrayList<Integer> olympicYears = new ArrayList<>();
        for (int year = 1896; year <= 2020; year += 4) {
            if (year == 1916 || year == 1940 || year == 1944) continue;
            System.out.println(year);
            olympicYears.add(year); // add each year to an array list called olympicYears
        }
        // part II: enhanced for-loop
        System.out.println("======== enhanced for-loop ========");
        for (int anno : olympicYears) System.out.println(anno);
    }
}
