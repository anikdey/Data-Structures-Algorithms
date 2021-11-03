package problems;

public class GFGSingleLinkedList {

    Node head;
    Node tail;

    public void add(int data) {
        Node newestNode = new Node(data);
        if(head==null) {
            head = newestNode;
        } else {
            tail.next = newestNode;
        }
        tail = newestNode;
    }

    public static void printList(Node head) {
        if(head == null)
            return;
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void linkdelete(Node head, int M, int N) {
        Node temp = head;
        while (temp != null) {
            int mCounter = 1;
            while (temp != null && mCounter<M) {
                temp = temp.next;
                mCounter++;
            }
            if(temp == null)
                break;

            int nCounter = 0;
            while (temp != null && nCounter<N) {
                if(temp.next != null) {
                    temp.next = temp.next.next;
                }
                nCounter++;
            }
            if(temp != null)
                temp = temp.next;
        }



        /*if(M==0) {
            while (head != null && N>0) {
                head = head.next;
                N--;
            }
        } else {
            while (temp != null) {
                if(mCounter>1 && shouldSkip) {
                    mCounter--;
                    temp = temp.next;
                } else {
                    shouldSkip = false;
                    mCounter = M+1;
                    if(temp.next != null) {
                        temp.next = temp.next.next;
                    }
                    nCounter--;
                    if(nCounter == 0) {
                        shouldSkip = true;
                        nCounter = N;
                    }

                }
            }
        }*/
        printList(head);

    }

    class Node {
        int data;
        Node next;
        Node(int key) {
            data = key;
            next = null;
        }
    }


    public static void main(String[] args) {
        GFGSingleLinkedList list = new GFGSingleLinkedList();
        list.add(9);list.add(1);list.add(3);list.add(5);list.add(9);list.add(4);list.add(10);list.add(1);
        printList(list.head);
        linkdelete(list.head, 2, 1);
        //list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
        printList(list.head);
    }


}
