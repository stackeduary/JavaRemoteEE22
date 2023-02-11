package FactoryMethod;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Bill's Bodacious Button</button>");
    }

    @Override
    public void onClick() {
        System.out.println("Click! My button says that I love cheeseburgers!");
    }
}
