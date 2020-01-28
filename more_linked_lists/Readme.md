# BST More Linked Lists
      
**Dificulty** : Easy

**Link** : https://www.hackerrank.com/challenges/30-linked-list-deletion/problem

__Objective__

Check out the Tutorial tab for learning materials and an instructional video!

__Task__

A Node class is provided for you in the editor. A Node object has an integer data field, __data__, and a Node instance pointer, __next__, pointing to another node (i.e.: the next node in a list).

A removeDuplicates function is declared in your editor, which takes a pointer to the __head__ node of a linked list as a parameter. Complete removeDuplicates so that it deletes any duplicate nodes from the list and returns the head of the updated list.


__Note__ : The __head__ pointer may be null, indicating that the list is empty. Be sure to reset your __next__ pointer when performing deletions to avoid breaking the list.

__Input Format__

You do not need to read any input from stdin. The following input is handled by the locked stub code and passed to the removeDuplicates function:
The first line contains an integer, __N__, the number of nodes to be inserted.
The __N__ subsequent lines each contain an integer describing the __data__ value of a node being inserted at the list's tail.

__Constraints__
- The data elements of the linked list argument will always be in non-decreasing order.

__Output Format__

Your removeDuplicates function should return the head of the updated linked list. The locked stub code in your editor will print the returned list to stdout.

#### Sample Input:

```
6
1
2
2
3
3
4
```

#### Sample Output:

```
1 2 3 4 
```

#### Explanation:

__N=6__, and our non-decreasing list is __{1,2,2,3,3,4}__. The values __2__ and __3__ both occur twice in the list, so we remove the two duplicate nodes. We then return our updated (ascending) list, which is __{1,2,3,4}__.

## SOLUTION IN JAVA

```java
import java.util.*;

public class More_Linked_Lists {

    public static Node removeDuplicates(Node head) {
        if (head == null) return null;

        Queue<Integer> dataSet = new ArrayDeque<>();
        Node current = head;
        while (current != null) {
            if (!dataSet.contains(current.data)){
                dataSet.add(current.data);
            }
            current = current.next;
        }
        if (dataSet.size()==0) return null;
        Node finalNode = null;
        Node currentNode = null;
        for (Integer i : dataSet){
            Node newNode = new Node(i);
            if (currentNode==null){
                currentNode = newNode;
                finalNode = currentNode;
            }else{
                currentNode.next = newNode;
                currentNode = currentNode.next;
            }
        }

        return finalNode;
    }

    public static Node insert(Node head, int data) {
        Node p = new Node(data);
        if (head == null)
            head = p;
        else if (head.next == null)
            head.next = p;
        else {
            Node start = head;
            while (start.next != null)
                start = start.next;
            start.next = p;

        }
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        head = removeDuplicates(head);
        display(head);

    }

}


class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}
```
