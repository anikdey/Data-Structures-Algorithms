// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head);
            System.out.println();
        }
    }

    public static void printList(Node head)
    {
        if(head == null)
            return;

        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{


    static Node newHead = null;
    static Node tail = null;

    static Node segregate(Node head) {
        int countOfOne = 0;
        int countOfTwo = 0;
        int countOfZero = 0;

        while(head != null) {
            if(head.data == 1) {
                countOfOne++;
            } else if(head.data == 2) {
                countOfTwo++;
            } else {
                countOfZero++;
            }
            head = head.next;
        }

        newHead = null;
        tail = null;

        while(countOfZero != 0){
            insert(0);
            countOfZero--;
        }

        while(countOfOne != 0){
            insert(1);
            countOfOne--;
        }

        while(countOfTwo != 0){
            insert(2);
            countOfTwo--;
        }
        return newHead;
    }


    static void insert(int data) {
        Node newestNode = new Node(data);
        if(newHead == null) {
            newHead = newestNode;
        } else {
            tail.next = newestNode;
        }
        tail = newestNode;
    }


}


