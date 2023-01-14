package InterfaceExample;

public class Vietnamese implements CanSpeak {

    public void sayHello(String pronoun) {
        System.out.println("Chao " + pronoun);
    }

    public void sayHello() {

    }

    public void sayGoodbye() {
        System.out.println("Tam biet");
    }

    public void sayGoodbye(String pronoun) {
        System.out.println("Tam biet, " + pronoun);
    }

    public void sayExcuseMe() {
        System.out.println("This phrase does not exist");
    } // xin loi

    public void cheers() {
        System.out.println("Mot hai ba doooooo!");
    }
}
