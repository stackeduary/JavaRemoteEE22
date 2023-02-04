package Enums;

public class Main {
    public static void main(String[] args) {
        Ethnicities heritage = Ethnicities.ESTONIAN;
//        Ethnicities heritage = Ethnicities.JAPANESE;
//        Ethnicities heritageNew = "Peruvian"; // error, won't compile
        String greeting = null;
        String capital = null;
        boolean lovesCheeseburgers = true;
        switch (heritage) {
            case JAPANESE -> {
                greeting = "Konichiwa";
                capital = "Tokyo";
                break;
            }
            case ESTONIAN -> {
                greeting = "Tere";
                capital = "Tallinn";
                break;
            }
            case NIGERIAN -> {
                greeting = "Daaru";
                capital = "Abuja";
                break;
            }
            case FINNISH -> {
                greeting = "Moi";
                capital = "Helsinki";
                break;
            }
            case AMERICAN -> {
                greeting = "Yo what's up";
                capital = "The District of Columbia";
                break;
            }
            case POLISH -> {
                greeting = "Jak se masz";
                capital = "Warsaw";
                break;
            }
            case SWEDISH -> {
                greeting = "Halla";
                capital = "Stockholm";
                break;
            }
            case chinese -> {
                greeting = "Ni hao";
                capital = "Peking";
                System.out.println(capital + ", one of the oldest civilizations in the world");
                break;
            }
        }

        // what follows below is a short demonstration about using enums combined with the printf() method; enums and the printf() method are completely unrelated, and were just combined here arbitrarily
        String BillFavoriteFood = "sashimi";
        System.out.printf("%s is one of Bill's many favorite foods", BillFavoriteFood);
        System.out.printf("%s, %s is the best city in the world!", greeting, capital);
        System.out.printf("%s is one of Bill's many favorite foods", BillFavoriteFood); // %s is just a placeholder
        System.out.println();
        System.out.println("============");
        System.out.print(capital);
        System.out.print(greeting);
        System.out.print(BillFavoriteFood);
        System.out.println("============");
        System.out.println();
        System.out.println("Pi with a lot of decimal places " + Math.PI);
        System.out.printf("Pi to two decimal places: %.3f", Math.PI);

        System.out.printf("%s, %s is the best city in the world!", greeting, capital, "cheeseburger");
        // the string "cheeseburger" doesn't appear in the print statement above because there is no `%s` corresponding to it; there are only two `%s` statements, and they're populated by `greeting` and `capital`; the extra arguments are ignored
        // see https://www.baeldung.com/java-printstream-printf for more info
    }
}
