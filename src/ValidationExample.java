public class ValidationExample {
    public static boolean isCapitalized(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        return Character.isUpperCase(word.charAt(0));
    }

    public static void main(String[] args) {
        String name = null;
        System.out.println(ValidationExample.isCapitalized("Bill"));
        System.out.println(ValidationExample.isCapitalized("")); // validation above prevents a StringIndexOutOfBoundsException
        System.out.println(ValidationExample.isCapitalized(name));
//        System.out.println(name.isEmpty()); // NPE
    }
}