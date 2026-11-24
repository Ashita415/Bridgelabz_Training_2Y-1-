package Arrays.hashmap.Assignment;
import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        int sum = 0;
        boolean found = false;

        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int index : map.get(sum)) {
                    found = true;
                    System.out.print("Subarray: ");
                    for (int j = index + 1; j <= i; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }

        if (!found) {
            System.out.println("No zero sum subarray found");
        }

        sc.close();
    }
}

