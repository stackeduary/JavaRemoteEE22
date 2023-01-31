import Decorators.*;

public class DecoratorDemo {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nLionel Messi,65,838,750.93\nRinaldo,200000000\nJayson Tatum,30,351,780";

        // composition twice ==> two wrappers
        DataSourceDecorator encoded = new CompressionDecorator(new EncryptionDecorator(new FileDataSource("out/OutputDemo.txt")));

        encoded.writeData(salaryRecords);

        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
