# Running Time and Complexity
      
**Difficulty** : Medium

**Link** : https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem

__Objective__

Today we're learning about running time! Check out the Tutorial tab for learning materials and an instructional video!

__Task__

A prime is a natural number greater than  that has no positive divisors other than __1__ and itself. Given a number, __1__ , determine and print whether it's __Prime__ or __Not prime__.

__Note:__ If possible, try to come up with a __O(sqrt(n))__  primality algorithm, or see what sort of optimizations you come up with for an __O(n)__ algorithm. Be sure to check out the Editorial after submitting your code!

__Input Format__

The first line contains an integer, __T__, the number of test cases.
Each of the __T__ subsequent lines contains an integer, __n__, to be tested for primality.

__Constraints__
-  1 ≤ T ≤ 30
-  1 ≤ n ≤ 2 x 10^9

__Output Format__

For each test case, print whether __n__ is __Prime__ or __Not prime__ on a new line.

#### Sample Input:

```
3
12
5
7
```

#### Sample Output:

```
Not prime
Prime
Prime
```

#### Explanation:
Test Case 0: __n=12__.

__12__ is divisible by numbers other than __1__ and itself (i.e.: __2__, __3__ , __5__), so we print __Not prime__ on a new line.

Test Case 1: __n=5__.

__5__ is only divisible __1__ and itself, so we print __Prime__ on a new line.

Test Case 1: __n=7__.

__7__ is only divisible __1__ and itself, so we print __Prime__ on a new line.


## SOLUTION IN JAVA

```java
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
```
