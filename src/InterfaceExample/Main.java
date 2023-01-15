package InterfaceExample;

public class Main {
    public static void main(String[] args) {
        CanSpeak eestlane = new Estonian();
        eestlane.cheers();
//        System.out.println(eestlane.numberOfSteps());

        Mexican mexicano = new Mexican();
        mexicano.sayHello();

        NortheastAmerican murican = new NortheastAmerican();
        murican.sayGoodbye();

        Russian ruskie = new Russian();
        ruskie.sayExcuseMe();

        Vietnamese nguoiViet = new Vietnamese();
        nguoiViet.sayHello("ong");
        nguoiViet.sayGoodbye("em");

        Nigerian nwaAli = new Nigerian();
        nwaAli.sayHello();
    }
}
