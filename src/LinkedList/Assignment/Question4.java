package LinkedList.Assignment;

import java.util.Scanner;

class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;

    Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

public class Question4 {

    static Item head = null;
    static Scanner sc = new Scanner(System.in);

    static Item createItem() {
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        return new Item(name, id, quantity, price);
    }

    static void insertBeginning() {
        Item newNode = createItem();

        newNode.next = head;
        head = newNode;

        System.out.println("Item added at beginning.");
    }

    static void insertEnd() {
        Item newNode = createItem();

        if (head == null) {
            head = newNode;
        } else {
            Item temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        System.out.println("Item added at end.");
    }

    static void insertPosition() {
        System.out.print("Enter position: ");
        int pos = sc.nextInt();

        if (pos < 1) {
            System.out.println("Invalid position.");
            return;
        }

        if (pos == 1) {
            insertBeginning();
            return;
        }

        Item temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        Item newNode = createItem();

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Item added at position " + pos);
    }

    static void deleteItem() {
        System.out.print("Enter Item ID to delete: ");
        int id = sc.nextInt();

        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if (head.id == id) {
            head = head.next;
            System.out.println("Item deleted successfully.");
            return;
        }

        Item temp = head;

        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Item deleted successfully.");
        }
    }

    static void updateQuantity() {
        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();

        Item temp = head;

        while (temp != null) {
            if (temp.id == id) {
                System.out.print("Enter New Quantity: ");
                temp.quantity = sc.nextInt();

                System.out.println("Quantity updated successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Item not found.");
    }

    static void displayItem(Item temp) {
        System.out.println("Item Name: " + temp.name);
        System.out.println("Item ID: " + temp.id);
        System.out.println("Quantity: " + temp.quantity);
        System.out.println("Price: " + temp.price);
        System.out.println("Total Value: " + (temp.price * temp.quantity));
        System.out.println("------------------------");
    }

    static void searchByID() {
        System.out.print("Enter Item ID: ");
        int id = sc.nextInt();

        Item temp = head;

        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Item Found!");
                displayItem(temp);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Item not found.");
    }

    static void searchByName() {
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        Item temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                displayItem(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

    static void totalInventoryValue() {
        Item temp = head;
        double total = 0;

        while (temp != null) {
            total += temp.price * temp.quantity;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    static void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        Item temp = head;

        System.out.println("\n--- Inventory Records ---");

        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    static void sortInventory() {
        if (head == null || head.next == null) {
            System.out.println("Not enough items to sort.");
            return;
        }

        System.out.println("1. Sort by Item Name");
        System.out.println("2. Sort by Price");

        System.out.print("Enter sorting choice: ");
        int field = sc.nextInt();

        System.out.println("1. Ascending Order");
        System.out.println("2. Descending Order");

        System.out.print("Enter order: ");
        int order = sc.nextInt();

        if ((field != 1 && field != 2) ||
                (order != 1 && order != 2)) {
            System.out.println("Invalid choice.");
            return;
        }

        Item sorted = null;
        Item temp = head;

        while (temp != null) {
            Item next = temp.next;

            if (sorted == null ||
                    compare(temp, sorted, field, order) < 0) {

                temp.next = sorted;
                sorted = temp;

            } else {
                Item current = sorted;

                while (current.next != null &&
                        compare(temp, current.next, field, order) >= 0) {

                    current = current.next;
                }

                temp.next = current.next;
                current.next = temp;
            }

            temp = next;
        }

        head = sorted;

        System.out.println("Inventory sorted successfully.");
        displayInventory();
    }

    static int compare(Item a, Item b, int field, int order) {
        int result;

        if (field == 1) {
            result = a.name.compareToIgnoreCase(b.name);
        } else {
            result = Double.compare(a.price, b.price);
        }

        if (order == 2) {
            result = -result;
        }

        return result;
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Item at Beginning");
            System.out.println("2. Add Item at End");
            System.out.println("3. Add Item at Specific Position");
            System.out.println("4. Delete Item by ID");
            System.out.println("5. Update Item Quantity");
            System.out.println("6. Search Item by ID");
            System.out.println("7. Search Item by Name");
            System.out.println("8. Display Inventory");
            System.out.println("9. Calculate Total Inventory Value");
            System.out.println("10. Sort Inventory");
            System.out.println("11. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    insertBeginning();
                    break;

                case 2:
                    insertEnd();
                    break;

                case 3:
                    insertPosition();
                    break;

                case 4:
                    deleteItem();
                    break;

                case 5:
                    updateQuantity();
                    break;

                case 6:
                    searchByID();
                    break;

                case 7:
                    searchByName();
                    break;

                case 8:
                    displayInventory();
                    break;

                case 9:
                    totalInventoryValue();
                    break;

                case 10:
                    sortInventory();
                    break;

                case 11:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 11);

        sc.close();
    }
}

