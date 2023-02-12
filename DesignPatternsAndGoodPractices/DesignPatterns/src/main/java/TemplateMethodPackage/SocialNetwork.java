package TemplateMethodPackage;

public abstract class SocialNetwork {
    String userName;
    String password;

    SocialNetwork() {}

    // template method:
    // it's an algorithm that calls a sequence of steps (i.e., other methods)
    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();

    // helper method that is not important in the context of this design pattern
    void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
