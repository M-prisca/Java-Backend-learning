//**Brewing up a digital bean counter**

// Create a Java program for a coffee shop inventory system.
//  Fill in the blanks to declare the main class, method, and parameter correctly. 
//  The program should display the shop's name, 
//  number of coffee types, average price, and whether it's open.

public class CoffeeShopInventory {
    public static void main(String args[]) {
        String shopName = "Java beans";
        int coffeeTypes = 5;
        double averagePrice = 3.99;
        boolean isOpen = true;

        System.out.printf("Shop: %s\nCoffee Types: %d\nAverage Price: $%.2f\nOpen: %b\n", shopName, coffeeTypes,
                averagePrice, isOpen);

    }
}
