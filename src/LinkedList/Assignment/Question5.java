package LinkedList.Assignment;

import java.util.Scanner;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;
    Ticket next;

    Ticket(int ticketId, String customerName, String movieName,
           String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

public class Question5 {

    static Ticket head = null;
    static Ticket tail = null;
    static Scanner sc = new Scanner(System.in);

    static void addTicket() {
        System.out.print("Enter Ticket ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String customer = sc.nextLine();

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        String seat = sc.nextLine();

        System.out.print("Enter Booking Time: ");
        String time = sc.nextLine();

        Ticket newNode = new Ticket(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        System.out.println("Ticket booked successfully!");
    }

    static void deleteTicket() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        System.out.print("Enter Ticket ID to delete: ");
        int id = sc.nextInt();

        Ticket temp = head;
        Ticket prev = tail;

        do {
            if (temp.ticketId == id) {

                if (head == tail) {
                    head = null;
                    tail = null;
                } else {
                    prev.next = temp.next;

                    if (temp == head) {
                        head = temp.next;
                    }

                    if (temp == tail) {
                        tail = prev;
                    }

                    tail.next = head;
                }

                System.out.println("Ticket cancelled successfully.");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Ticket not found.");
    }

    static void displayTicket(Ticket temp) {
        System.out.println("\nTicket ID: " + temp.ticketId);
        System.out.println("Customer Name: " + temp.customerName);
        System.out.println("Movie Name: " + temp.movieName);
        System.out.println("Seat Number: " + temp.seatNumber);
        System.out.println("Booking Time: " + temp.bookingTime);
        System.out.println("--------------------------");
    }

    static void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = head;

        System.out.println("\n===== BOOKED TICKETS =====");

        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    static void searchByCustomer() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                displayTicket(temp);
                found = true;
            }

            temp = temp.next;

        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for this customer.");
        }
    }

    static void searchByMovie() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                displayTicket(temp);
                found = true;
            }

            temp = temp.next;

        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found for this movie.");
        }
    }

    static void totalTickets() {
        int count = 0;

        if (head == null) {
            System.out.println("Total Booked Tickets: 0");
            return;
        }

        Ticket temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Booked Tickets: " + count);
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== ONLINE TICKET RESERVATION SYSTEM =====");
            System.out.println("1. Add New Ticket");
            System.out.println("2. Remove Ticket by ID");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search by Customer Name");
            System.out.println("5. Search by Movie Name");
            System.out.println("6. Count Total Booked Tickets");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addTicket();
                    break;

                case 2:
                    deleteTicket();
                    break;

                case 3:
                    displayTickets();
                    break;

                case 4:
                    searchByCustomer();
                    break;

                case 5:
                    searchByMovie();
                    break;

                case 6:
                    totalTickets();
                    break;

                case 7:
                    System.out.println("Exiting Reservation System...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}

