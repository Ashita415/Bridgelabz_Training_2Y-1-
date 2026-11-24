package Arrays.Assignment.Level2;
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];

        int index = 0;

        number = Math.abs(number);

        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        if (index < 2) {
            System.out.println("At least two digits are required.");
            return;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        if (secondLargest == -1) {
            System.out.println("Second largest distinct digit does not exist.");
        } else {
            System.out.println("Largest Digit: " + largest);
            System.out.println("Second Largest Digit: " + secondLargest);
        }

        sc.close();
    }
}

