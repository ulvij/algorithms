# Nested Logic
      
**Dificulty** : Easy

**Link** : https://www.hackerrank.com/challenges/30-nested-logic/problem

__Objective__

Today's challenge puts your understanding of nested conditional statements to the test. You already have the knowledge to complete this challenge, but check out the Tutorial tab for a video on testing!
__Task__

Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:
1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: __fine=0__ ).
2. If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, __fine=15 Hackos x (the number of days late)__  .
3. If the book is returned after the expected return month but still within the same calendar year as the expected return date, the __fine=500 Hackos x (the number of months late)__ .
4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of __10000 Hackos__.

__Input Format__

The first line contains 3 space-separated integers denoting the respective __day__, __month__, and __year__  on which the book was actually returned.
The second line contains 3 space-separated integers denoting the respective __day__, __month__, and __year__  on which the book was expected to be returned (due date).

__Constraints__
-  1 ≤ D ≤ 31
-  1 ≤ M ≤ 12
-  1 ≤ Y ≤ 3000
-  __It is guaranteed that the dates will be valid Gregorian calendar dates__


__Output Format__

Print a single integer denoting the library fine for the book received as input.

#### Sample Input:

```
9 6 2015
6 6 2015
```

#### Sample Output:

```
45
```

## SOLUTION IN JAVA

```java
import java.util.Scanner;
class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dateOneArray = new int[3];
        int[] dateTwoArray = new int[3];

        String[] dateOne = scanner.nextLine().split(" ");

        for (int i = 0; i < dateOne.length; i++) {
            dateOneArray[i] = Integer.parseInt(dateOne[i]);
        }

        String[] dateTwo = scanner.nextLine().split(" ");

        for (int i = 0; i < dateTwo.length; i++) {
            dateTwoArray[i] = Integer.parseInt(dateTwo[i]);
        }
        int hackos = 0;

        // check days
        if (dateOneArray[0] >= dateTwoArray[0]) {
            hackos = (dateOneArray[0] - dateTwoArray[0]) * 15;
        }

        if (dateOneArray[1] > dateTwoArray[1]) {
            hackos = (dateOneArray[1] - dateTwoArray[1]) * 500;
        }else if(dateOneArray[1]<dateTwoArray[1]) {
            hackos=0;
        }

        if (dateOneArray[2] > dateTwoArray[2]) {
            hackos = 10000;
        }else if (dateOneArray[2]<dateTwoArray[2]){
            hackos=0;
        }

        System.out.println(hackos);
    }
}
```
