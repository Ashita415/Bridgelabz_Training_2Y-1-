package Arrays.hashmap.Assignment;
import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int complement = target - arr[i];

            if (set.contains(complement)) {
                System.out.println("Pair found: " + complement + " and " + arr[i]);
                found = true;
                break;
            }

            set.add(arr[i]);
        }

        if (!found) {
            System.out.println("No pair found");
        }

        sc.close();
    }
}

