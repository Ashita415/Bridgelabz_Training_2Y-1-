package LinkedList.Assignment;

import java.util.Scanner;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class Question3 {

    static Task head = null;
    static Task current = null;
    static Scanner sc = new Scanner(System.in);

    static Task createTask() {
        System.out.print("Enter Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Task Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Priority: ");
        int priority = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Due Date: ");
        String date = sc.nextLine();

        return new Task(id, name, priority, date);
    }

    static void insertBeginning() {
        Task newNode = createTask();

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            Task temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }

        System.out.println("Task added at beginning.");
    }

    static void insertEnd() {
        Task newNode = createTask();

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
        } else {
            Task temp = head;

            while (temp.next != head) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }

        System.out.println("Task added at end.");
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

        if (head == null) {
            System.out.println("Invalid position.");
            return;
        }

        Task temp = head;

        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        if (temp.next == head && pos > 2) {
            System.out.println("Invalid position.");
            return;
        }

        Task newNode = createTask();

        newNode.next = temp.next;
        temp.next = newNode;

        System.out.println("Task added at position " + pos);
    }

    static void deleteTask() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        System.out.print("Enter Task ID to delete: ");
        int id = sc.nextInt();

        Task temp = head;
        Task prev = null;

        do {
            if (temp.taskId == id) {

                if (temp == head && temp.next == head) {
                    head = null;
                    current = null;
                } else if (temp == head) {
                    Task last = head;

                    while (last.next != head) {
                        last = last.next;
                    }

                    head = head.next;
                    last.next = head;

                    if (current == temp) {
                        current = head;
                    }
                } else {
                    prev.next = temp.next;

                    if (current == temp) {
                        current = temp.next;
                    }
                }

                System.out.println("Task deleted successfully.");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Task not found.");
    }

    static void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n--- Current Task ---");
        displayTask(current);

        current = current.next;

        System.out.println("Moved to next task.");
    }

    static void displayTask(Task temp) {
        System.out.println("Task ID: " + temp.taskId);
        System.out.println("Task Name: " + temp.taskName);
        System.out.println("Priority: " + temp.priority);
        System.out.println("Due Date: " + temp.dueDate);
        System.out.println("--------------------");
    }

    static void displayAllTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        Task temp = head;

        System.out.println("\n--- All Tasks ---");

        do {
            displayTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    static void searchByPriority() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        System.out.print("Enter Priority to search: ");
        int priority = sc.nextInt();

        Task temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                displayTask(temp);
                found = true;
            }

            temp = temp.next;

        } while (temp != head);

        if (!found) {
            System.out.println("No tasks found with this priority.");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== TASK SCHEDULER =====");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Specific Position");
            System.out.println("4. Delete Task by ID");
            System.out.println("5. View Current Task and Move Next");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("8. Exit");

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
                    deleteTask();
                    break;

                case 5:
                    viewCurrentTask();
                    break;

                case 6:
                    displayAllTasks();
                    break;

                case 7:
                    searchByPriority();
                    break;

                case 8:
                    System.out.println("Exiting Task Scheduler...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        sc.close();
    }
}

