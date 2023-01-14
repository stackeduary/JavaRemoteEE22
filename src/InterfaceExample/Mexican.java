package InterfaceExample;

public class Mexican implements CanSpeak {
    public void sayHello() {
        System.out.println("Hola");
    }

    public void sayGoodbye() {
        System.out.println("Adiós");
    }

    public void sayExcuseMe() {
        System.out.println("Perdón"); // o disculpe
    }

    public void cheers() {
        System.out.println("Santé!");
    }
}
