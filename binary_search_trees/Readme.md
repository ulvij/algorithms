# Binary Search Trees

**Dificulty** : Easy

**Link** : https://www.hackerrank.com/challenges/30-binary-search-trees/problem



__Objective__

Today, we're working with Binary Search Trees (BSTs). Check out the Tutorial tab for learning materials and an instructional video!

__Task__

The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. You are given a pointer, __root__, pointing to the root of a binary search tree. Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.

__Input Format__

The locked stub code in your editor reads the following inputs and assembles them into a binary search tree:
The first line contains an integer, __n__ , denoting the number of nodes in the tree.
Each of the __n__ subsequent lines contains an integer, __data__, denoting the value of an element that must be added to the BST.

__Output Format__

The locked stub code in your editor will print the integer returned by your getHeight function denoting the height of the BST.

#### Sample Input:

```
7
3
5
2
1
4
6
7
```

#### Sample Output:

```
3
```

#### Explanation:

There are __4__ nodes in long path that are connected by __3__ edges, meaning our BST's __height=3__. Thus, we print __3__ as our answer.

## SOLUTION IN JAVA

```java
import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    public static int getHeight(Node root){
        int count = 0;
        if (root == null) return 0;
        if (root.left==null && root.right==null) return count;
        count = 1;
        count += Math.max(getHeight(root.left),getHeight(root.right));
        return count;
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
}
```
