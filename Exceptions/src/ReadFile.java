import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    /*
     * Added the exception to the method signature
     * */
//    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream(new File("/home/bill/Documents/SDA/Teaching/JavaRemoteEE22/JavaAdvancedFeatures/Exceptions/src/test.txt"));
//        fis.read();
//    }

        public static void main(String[] args) {
        /*
         * Added a try/catch block to handle any exceptions if they arise
         * */
        try {
            FileInputStream fis = new FileInputStream("/home/bill/Documents/SDA/Teaching/JavaRemoteEE22/JavaAdvancedFeatures/Exceptions/src/test.txt");
            fis.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*
     * Doing no error/exception handling at all will cause a compiler error
     * */
//    public static void main(String[] args) {
//        FileInputStream fis = new FileInputStream(new File("/home/bill/Documents/SDA/Teaching/JavaRemoteEE22/JavaAdvancedFeatures/Exceptions/src/test.txt"));
//        fis.read();
//    }

}
