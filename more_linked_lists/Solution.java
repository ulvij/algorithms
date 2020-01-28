package hackerrank.news;

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