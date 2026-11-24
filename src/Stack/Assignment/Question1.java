package Stack.Assignment;
import java.util.*;
public class Question1 {

    static Stack<Integer> stack = new Stack<>();

    static void insertSorted(int x) {

        if (stack.isEmpty() || stack.peek() <= x) {
            stack.push(x);
            return;
        }

        int temp = stack.pop();

        insertSorted(x);

        stack.push(temp);
    }

    static void sortStack() {

        if (stack.isEmpty()) {
            return;
        }

        int x = stack.pop();

        sortStack();

        insertSorted(x);
    }

    static void display() {
        System.out.println("Stack (Bottom to Top): " + stack);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter stack elements:");

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            stack.push(x);
        }

        System.out.println("Original Stack:");
        display();

        sortStack();

        System.out.println("Sorted Stack (Ascending):");
        display();

        sc.close();
    }
}

