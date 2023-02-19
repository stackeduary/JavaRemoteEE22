// This is an example of an unchecked (AKA runtime) exception
 public class ArrayNullPointerExceptionExample {
    public static void main(String[] args) {
        String[] strArr = null;
        System.out.println(strArr);
        System.out.println(strArr.length);
    }
}
