package Stack.Assignment;
import java.util.*;
public class Question2 {

    static void calculateSpan(int price[], int n) {

        int span[] = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                    price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.peek();
            }

            stack.push(i);
        }

        System.out.println("Stock Span:");

        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();

        int price[] = new int[n];

        System.out.println("Enter stock prices:");

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        calculateSpan(price, n);

        sc.close();
    }
}

