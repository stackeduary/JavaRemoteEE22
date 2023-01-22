/*
Copyright © 2023 Pärt Johanson
*/


package InterfaceAsTypePackage;

interface Animal {
    public void makeNoise();

    public default String makeNoisier() {
        return "You have been hacked! And all your money is gone!";
    }
}

class Cat implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }
}

class Dog implements Animal {

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }
}
