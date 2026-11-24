package Stack.Assignment;
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter window size: ");
        int k = sc.nextInt();

        if (k <= 0 || k > n) {
            System.out.println("Invalid window size");
            return;
        }

        Deque<Integer> dq = new ArrayDeque<>();

        System.out.println("Sliding Window Maximum:");

        for (int i = 0; i < n; i++) {

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);

            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }

        sc.close();
    }
}

