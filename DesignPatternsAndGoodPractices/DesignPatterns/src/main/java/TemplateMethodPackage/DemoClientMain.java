package TemplateMethodPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoClientMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SocialNetwork socialNetwork = null;
        System.out.println("Please dear sir or madam, kindly enter your user name.");
        String userName = br.readLine();
        System.out.println("And would you kindly enter your password as well?");
        String password = br.readLine();

        System.out.println("Now is your time to shine. Enter your wittiest quip here:");
        String message = br.readLine();

        System.out.println("Dear sir/madam: please choose which of my outstanding social networks you would like to kill your brain cells with. \n1 for Twacebook\n2 for Fitter");
        int choice = Integer.parseInt(br.readLine());

        if (choice == 1) {
            socialNetwork = new Twacebook(userName, password);
        } else if (choice == 2) {
            socialNetwork = new Fitter(userName, password);
        }
        socialNetwork.post(message);
    }

}
