package interviewcoding;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int number = 2;
        int lastDigit;
        int sumOfSquareOfDigit = 0;
        Set<Integer> set = new HashSet<>();
        while (number != 1) {
            if (set.contains(number)) {
                System.out.println("Not a Happy Number!!");
                return;
            }
            set.add(number);
            while (number != 0) {
                lastDigit = number % 10;
                sumOfSquareOfDigit = sumOfSquareOfDigit + (lastDigit * lastDigit);
                number = number / 10;
            }
            number = sumOfSquareOfDigit;
            sumOfSquareOfDigit = 0;
        }
        if (number == 1) {
            System.out.println("Happy Number");
        }
    }
}
