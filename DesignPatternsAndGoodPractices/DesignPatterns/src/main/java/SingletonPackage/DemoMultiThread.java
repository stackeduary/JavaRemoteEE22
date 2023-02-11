package SingletonPackage;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then the singleton was reused. WOOOOOOOOOOO! \nIf you see different values, then two singletons were created :_(");
        Thread threadCheese = new Thread(new ThreadCheese());
        Thread threadBurger = new Thread(new ThreadBurger());
        threadCheese.start();
        threadBurger.start();
    }

    static class ThreadCheese implements Runnable {
        @Override
        public void run() {
            Singleton cheeseSingleton = Singleton.getInstance("cheese");
            System.out.println(cheeseSingleton.value);
        }
    }

    static class ThreadBurger implements Runnable {

        @Override
        public void run() {
            Singleton burgerSingleton = Singleton.getInstance("burger");
            System.out.println(burgerSingleton.value);
        }
    }
}
