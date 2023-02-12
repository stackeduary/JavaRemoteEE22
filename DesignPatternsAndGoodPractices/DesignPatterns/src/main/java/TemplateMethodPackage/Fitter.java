package TemplateMethodPackage;

public class Fitter extends SocialNetwork {
    public Fitter(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        System.out.println("\nChecking the user's credentials. Please wait.");
        System.out.println("User: " + this.userName);
        System.out.print("Password: ");
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("Great success! You can now use the OTHER greatest social network in world, Fitter! Have fun!! Tell your friends!!!");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: " + new String(data) + " was posted on the world's noisiest and most toxic public square! (Psst: I hope your feets are not public...");
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void logOut() {
        System.out.println("User: '" + userName + "' has been logged out of the cesspool that is Fitter (you may have been shadow banned...but you'll never know.... )");
    }
}
