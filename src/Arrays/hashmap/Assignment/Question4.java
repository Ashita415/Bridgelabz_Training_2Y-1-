package Arrays.hashmap.Assignment;

import java.util.*;

class MyHashMap {
    class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] buckets;
    private int size = 10;

    MyHashMap() {
        buckets = new Node[size];
    }

    private int hash(int key) {
        return Math.floorMod(key, size);
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node temp = buckets[index];

        while (temp != null) {
            if (temp.key == key) {
                temp.value = value;
                System.out.println("Value updated");
                return;
            }
            temp = temp.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;

        System.out.println("Key-value pair inserted");
    }

    public int get(int key) {
        int index = hash(key);
        Node temp = buckets[index];

        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }

        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Node temp = buckets[index];
        Node prev = null;

        while (temp != null) {
            if (temp.key == key) {
                if (prev == null) {
                    buckets[index] = temp.next;
                } else {
                    prev.next = temp.next;
                }

                System.out.println("Key deleted");
                return;
            }

            prev = temp;
            temp = temp.next;
        }

        System.out.println("Key not found");
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            Node temp = buckets[i];

            if (temp != null) {
                System.out.print("Bucket " + i + ": ");

                while (temp != null) {
                    System.out.print("(" + temp.key + ", " + temp.value + ") ");
                    temp = temp.next;
                }

                System.out.println();
            }
        }
    }
}

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyHashMap map = new MyHashMap();

        while (true) {
            System.out.println("\n1. Insert");
            System.out.println("2. Retrieve");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    int key = sc.nextInt();

                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    map.put(key, value);
                    break;

                case 2:
                    System.out.print("Enter key to retrieve: ");
                    key = sc.nextInt();

                    int result = map.get(key);

                    if (result == -1) {
                        System.out.println("Key not found");
                    } else {
                        System.out.println("Value: " + result);
                    }
                    break;

                case 3:
                    System.out.print("Enter key to delete: ");
                    key = sc.nextInt();

                    map.remove(key);
                    break;

                case 4:
                    map.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

