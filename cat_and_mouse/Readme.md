# Cats and a Mouse

**Difficulty** : Easy

**Link** : https://www.hackerrank.com/challenges/cats-and-a-mouse/problem

Two cats and a mouse are at various positions on a line. You will be given their starting positions. Your task is to determine which cat will reach the mouse first, assuming the mouse doesn't move and the cats travel at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.

You are given  queries in the form of __x, y, and z__  representing the respective positions for cats __A and B__, and for mouse __C__. Complete the function __catAndMouse__ to return the appropriate answer to each query, which will be printed on a new line.
- If cat __A__ catches the mouse first, print __Cat A__. 
- If cat __B__ catches the mouse first, print __Cat B__. 
- If both cats reach the mouse at the same time, print __Mouse C__ as the two cats fight and mouse escapes.

For example, cat __A__ is at position __x=2__ and cat __B__ is at __y=5__. If mouse __C__ is at position __z=4__, it is __2__ units from cat __A__ and __1__ unit from cat __B__. Cat __B__B will catch the mouse.

__Function Description__

Complete the catAndMouse function in the editor below. It should return one of the three strings as described.
catAndMouse has the following parameter(s):

- x: an integer, Cat __A__'s position
- y: an integer, Cat __B__'s position
- z: an integer, Mouse __C__'s position

__Input Format__

The first line contains a single integer, __q__, denoting the number of queries.
Each of the __q__ subsequent lines contains three space-separated integers describing the respective values of  __x__(cat __A__'s location),  __y__(cat __B__'s location), and  __z__(mouse __C__'s location).

__Constraints__

-  1 ≤ q ≤ 100
-  1 ≤ x,y,z ≤ 100

__Output Format__

For each query, return __Cat A__ if cat __A__ catches the mouse first, __Cat B__ if cat __B__ catches the mouse first, or __Mouse C__ if the mouse escapes.

#### Sample Input:

```
2
1 2 3
1 3 2
```

#### Sample Output:

```
Cat B
Mouse C
```

#### Explanation:

Cat __B__ will catch the mouse first, so we print Cat B on a new line

## SOLUTION IN KOTLIN

```kotlin
fun catAndMouse(x: Int, y: Int, z: Int): String {
    if ((if ((z - x) < 0) (-1 * (z - x)) else (z - x)) == (if ((z - y) < 0) (-1 * (z - y)) else (z - y))) return "Mouse C"

    return if (x <= z && y <= z) {
        "Cat ${if (x > y) "A" else "B"}"
    } else if (x >= z && y >= z) {
        "Cat ${if (x > y) "B" else "A"}"
    } else {
        "Cat ${if ((if ((z - x) < 0) (-1 * (z - x)) else (z - x)) > (if ((z - y) < 0) (-1 * (z - y)) else (z - y))) "B" else "A"}"
    }
}
```
