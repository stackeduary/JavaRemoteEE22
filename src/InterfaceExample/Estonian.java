package InterfaceExample;

public class Estonian implements CanSpeak, CanWalk {

    public void sayHello() {
        System.out.println("Tere");
    }

    public void sayGoodbye() {
        System.out.println("Nägemist");
    }

    public void sayExcuseMe() {
        System.out.println("Vabandust");
    }

    public void cheers() {
        System.out.println("Terviseks!");
    }

    public void walkSlowly() {
        System.out.println("Ma longin"); // ma käin aeglaselt; Ma kõnnin aeglaselt
    }

    public void walkBriskly() {
        System.out.println("Ma kõnnin kiiresti");
    }

    public void run() {
        System.out.println("Ma jooksin");
    } // Ma jooksen

    public int numberOfSteps() {
        return (int) Math.floor(Math.random())*100;
    }
}
