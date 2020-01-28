package hackerrank.news;

import java.util.*;

public class Running_Time_and_Complexity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Integer[] array = new Integer[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        for (Integer integer : array) {
            boolean isPrime = true;
            if (integer == 1) {
                System.out.println("Not prime");
                continue;
            }
            for (int j = 2; j <= Math.sqrt(integer); j++) {
                if (integer % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");

            }
        }

    }
}