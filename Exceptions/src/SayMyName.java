// This is an example of exception handling for a runtime exception (because the exception is created with a null value on line 6)
public class SayMyName {
    public static void main(String[] args) {
        try {
            System.out.println(capitalizeMyName("bill"));
            System.out.println(capitalizeMyName(null));
        } catch (ILoveJavaException e) {
            System.err.println(e);
        } finally {
            System.out.println("Finally block: Isn't Java great once you get good at it?!");
        }
    }

    public static String capitalizeMyName(String nameInput) throws ILoveJavaException {
        if (nameInput != null) {
//            String firstLetter = nameInput.substring(0, 1).toUpperCase();
//            String restOfName = nameInput.substring(1).toLowerCase();
//            return firstLetter + restOfName;
            return nameInput.substring(0, 1).toUpperCase() + nameInput.substring(1).toLowerCase();
        } else {
            throw new ILoveJavaException("You have a null value for the name you want to capitalize.");
        }
    }
}
