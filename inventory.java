import java.util.*;

public class InventorySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> inventory = new HashMap<>();
        HashMap<String, Double> prices = new HashMap<>();

       
        inventory.put("Laptop", 10);
        inventory.put("Mouse", 50);
        inventory.put("Keyboard", 30);

        prices.put("Laptop", 1200.00);
        prices.put("Mouse", 25.50);
        prices.put("Keyboard", 50.76);

        while (true) {
            System.out.println("\nBrian Inventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Set Quantity");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Brian item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Brian item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Brian item quantity: ");
                    int quantity = scanner.nextInt();

                    inventory.put(name, inventory.getOrDefault(name, 0) + quantity);
                    prices.put(name, price);
                    System.out.println("Item added successfully.");
                    break;

                case 2:
                    System.out.print("Brian item name: ");
                    String itemjacob = scanner.nextLine();
                    if (inventory.containsKey(itemjacob)) {
                        System.out.print("Brian new quantity: ");
                        int newquantityjacob = scanner.nextInt();
                        if (newquantityjacob >= 0) {
                            inventory.put(itemjacob, newquantityjacob);
                            System.out.println("Quantity of " + itemjacob + " set to " + newquantityjacob);
                        }
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;

                case 3:
                    System.out.printf("\n%-15s %-10s %-10s%n", "Item", "Price", "Quantity");
                    System.out.println("-----------------------------------------");
                    for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                        System.out.printf("%-15s %-9.2f %-10d%n",
                                entry.getKey(), prices.get(entry.getKey()), entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                 

                default:
                    System.out.println("Invalid choice, Try again jacob ;)");
            }
        }
    }
}