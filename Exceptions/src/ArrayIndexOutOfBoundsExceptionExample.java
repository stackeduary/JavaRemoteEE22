// This is an example of an unchecked (AKA runtime) exception
public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String[] weekend = {"Saturday", "Sunday"};
        for (String day : weekend) {
            System.out.println(day);
        }
        System.out.println("It's Friday then...there's Saturday, Sunday, what?!");
        for (int i = 0; i <= weekend.length; i++) {
            System.out.println(weekend[i]);
        }
    }
}
