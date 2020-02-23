# BST Level-Order Traversal

**Difficulty** : Easy

**Link** : https://www.hackerrank.com/challenges/30-binary-trees/problem

__Objective__

Today, we're going further with Binary Search Trees. Check out the Tutorial tab for learning materials and an instructional video!

__Task__

A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right, top to bottom. You are given a pointer, __root__ , pointing to the root of a binary search tree. Complete the levelOrder function provided in your editor so that it prints the level-order traversal of the binary search tree.

__Hint__ : You'll find a queue helpful in completing this challenge.

__Input Format__

The locked stub code in your editor reads the following inputs and assembles them into a BST:
The first line contains an integer, __T__ (the number of test cases).
The __T__ subsequent lines each contain an integer, __data__, denoting the value of an element that must be added to the BST.

__Output Format__

Print the __data__ value of each node in the tree's level-order traversal as a single line of __N__ space-separated integers.


#### Sample Input:

```
6
3
5
4
7
2
1
```

#### Sample Output:

```
3 2 5 1 4 7
```

#### Explanation:

We traverse each level of the tree from the root downward, and we process the nodes at each level from left to right. The resulting level-order traversal is __3 -> 2 -> 5 -> 1 -> 4 -> 7__, and we print these data values as a single line of space-separated integers.

## SOLUTION IN JAVA

```java
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
    static void levelOrder(Node root) {
        Queue<Node> queue = new ArrayDeque<>();
        if (root != null) queue.add(root);

        while (queue.size() > 0) {
            Node n = queue.poll();
            System.out.print(n.data + " ");

            if (n.left != null) queue.add(n.left);
            if (n.right != null) queue.add(n.right);
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
```
