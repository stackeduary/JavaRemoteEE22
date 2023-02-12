package FactoryMethodPackage;


public class DemoClientMain {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        // client calls the constructor to create a new concrete creator class
        if (System.getProperty("os.name").equals("Linux")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HTMLDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
        System.out.println("Bill is running on " + System.getProperty("os.name"));
    }
}
