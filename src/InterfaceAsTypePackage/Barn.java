package InterfaceAsTypePackage;

public class Barn {
    public static void main(String[] args) {
        Animal aCat = new Cat();
        Animal aDog = new Dog();
        Animal anotherDog = new Dog();

        Animal animals[] = {aCat, aDog, anotherDog};

        // This will output: Meow! Woof! Woof! seperated by newlines
        for (Animal a: animals) {
            a.makeNoise();
        }
    }
}
