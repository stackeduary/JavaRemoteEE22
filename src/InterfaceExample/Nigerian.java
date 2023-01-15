package InterfaceExample;

public class Nigerian implements CanSpeak {

    @Override
    public void sayHello() {
        System.out.println("da' aru");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("bye bye");
    }

    @Override
    public void sayExcuseMe() {
        System.out.println("Cherigu");
    }

    @Override
    public void cheers() {
        System.out.println("We don't drink :(");
    }
}
