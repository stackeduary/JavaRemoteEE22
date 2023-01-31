package Singleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (wooooooooo! \uD83C\uDF7E)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!! \uD83D\uDE2D)" + "\n\n" +
                "RESULT:" + "\n");
        // call the public getInstance() method that will either create the singleton object if it doesn't already exist, or return it if it does exist
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
