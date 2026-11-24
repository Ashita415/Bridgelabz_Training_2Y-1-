package LinkedList.Assignment;
import java.util.Scanner;

class Movie {
    String title;
    String director;
    int year;
    double rating;

    Movie next;
    Movie prev;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

public class Question2 {

    static Movie head = null;
    static Movie tail = null;
    static Scanner sc = new Scanner(System.in);

    static Movie createMovie() {
        sc.nextLine();

        System.out.print("Enter Movie Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Director: ");
        String director = sc.nextLine();

        System.out.print("Enter Year of Release: ");
        int year = sc.nextInt();

        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();

        return new Movie(title, director, year, rating);
    }

    static void insertBeginning() {
        Movie newNode = createMovie();

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        System.out.println("Movie added at beginning.");
    }

    static void insertEnd() {
        Movie newNode = createMovie();

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Movie added at end.");
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

        Movie temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position.");
            return;
        }

        if (temp == tail) {
            insertEnd();
            return;
        }

        Movie newNode = createMovie();

        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;

        System.out.println("Movie added at position " + pos);
    }

    static void deleteMovie() {
        sc.nextLine();

        System.out.print("Enter Movie Title to delete: ");
        String title = sc.nextLine();

        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head) {
                    head = temp.next;
                }

                if (temp == tail) {
                    tail = temp.prev;
                }

                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }

                System.out.println("Movie deleted successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }

    static void searchByDirector() {
        sc.nextLine();

        System.out.print("Enter Director Name: ");
        String director = sc.nextLine();

        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found.");
        }
    }

    static void searchByRating() {
        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();

        Movie temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating == rating) {
                displayMovie(temp);
                found = true;
            }

            temp = temp.next;
        }

        if (!found) {
            System.out.println("No movies found.");
        }
    }

    static void displayMovie(Movie temp) {
        System.out.println("\nMovie Title: " + temp.title);
        System.out.println("Director: " + temp.director);
        System.out.println("Year: " + temp.year);
        System.out.println("Rating: " + temp.rating);
        System.out.println("------------------------");
    }

    static void displayForward() {
        if (head == null) {
            System.out.println("No movies available.");
            return;
        }

        Movie temp = head;

        System.out.println("\n--- Movies in Forward Order ---");

        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    static void displayReverse() {
        if (tail == null) {
            System.out.println("No movies available.");
            return;
        }

        Movie temp = tail;

        System.out.println("\n--- Movies in Reverse Order ---");

        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    static void updateRating() {
        sc.nextLine();

        System.out.print("Enter Movie Title: ");
        String title = sc.nextLine();

        Movie temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                System.out.print("Enter New Rating: ");
                temp.rating = sc.nextDouble();

                System.out.println("Rating updated successfully.");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Movie not found.");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== MOVIE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Specific Position");
            System.out.println("4. Delete Movie by Title");
            System.out.println("5. Search by Director");
            System.out.println("6. Search by Rating");
            System.out.println("7. Display Movies Forward");
            System.out.println("8. Display Movies Reverse");
            System.out.println("9. Update Movie Rating");
            System.out.println("10. Exit");

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
                    deleteMovie();
                    break;

                case 5:
                    searchByDirector();
                    break;

                case 6:
                    searchByRating();
                    break;

                case 7:
                    displayForward();
                    break;

                case 8:
                    displayReverse();
                    break;

                case 9:
                    updateRating();
                    break;

                case 10:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 10);

        sc.close();
    }
}

