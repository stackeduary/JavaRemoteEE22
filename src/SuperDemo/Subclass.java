package SuperDemo;

public final class Subclass extends Superclass {
    protected String location = "Sub";
    public void sayHello() {
        System.out.println("Hello from the subclass! And I am located in " + getClass());
        super.sayHello();
        System.out.println("The location of my super class is: " + location); // hides the parent class's `location` field because the child class has a field with the same name
        System.out.println("The location of my super class is: " + super.location); // the hidden field from the parent class is accessible with the `super` keyword
    }

    public static void main(String[] args) {
        Subclass sub = new Subclass();
        sub.sayHello();
    }
}
