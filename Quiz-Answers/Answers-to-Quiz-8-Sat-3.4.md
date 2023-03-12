## Quiz 8
#### Saturday, Mar. 4, 2023

1. Name the two types of exceptions in Java.
  - checked
    - developer is forced to handle
  - unchecked
    - dev does not have to have

2. What are the two ways of handling exceptions in Java?
  - using a try-catch block
  - adding the exception to method signature of the form `... throws <type of exception here>`

3. What are the two types of for-loops in Java?
  - general form
  - enhanced form (AKA `for-each` loop)

4. Using one of the two types, print out all the years that had modern Summer Olympics: https://en.wikipedia.org/wiki/Summer_Olympic_Games#List_of_Summer_Olympic_Games (assume that the 2020 Olympics happened in their normally-scheduled year).

5. Repeat #4 using the other type of for-loop.

Suggestions: use IntelliJ for #4 and #5

import java.util.ArrayList;

public class ForLoops {
    public static void main(String[] args) {
        // part I: general for-loop
        System.out.println("======== general for-loop ========");
        ArrayList<Integer> olympicYears = new ArrayList<>();
        for (int year = 1896; year <= 2020; year += 4) {
            if (year == 1916 || year == 1940 || year == 1944) continue;
            System.out.println(year);
            olympicYears.add(year); // add each year to an array list
        }
        // part II: enhanced for-loop
        System.out.println("======== enhanced for-loop ========");
        for (int anno : olympicYears) System.out.println(anno);
    }
}
