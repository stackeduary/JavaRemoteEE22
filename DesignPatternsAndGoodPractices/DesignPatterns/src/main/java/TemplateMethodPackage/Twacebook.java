package TemplateMethodPackage;

import org.w3c.dom.ls.LSOutput;

public class Twacebook extends SocialNetwork {
    public Twacebook(String userName, String password) {
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
        System.out.println("Great success! You can now use the greatest social network in world, Twacebook! Have fun!! Tell your friends!!!");
        return true;
    }

    @Override
    boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: " + new String(data) + " was posted on the world's greatest network and most epic waste of time, Twacebook! (Psst: YOU are the product..." + "\ud83d\ude08");
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void logOut() {
        System.out.println("User: '" + userName + "' has been logged out of the world's greatest social media network... (but their data is being used for only the most well-intentioned purposes...." + "\ud83d\ude08");
    }
}
