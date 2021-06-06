package chapter6.queue.animalshelter;

import chapter6.stack.ListStack;

public class AnimalShelter {


    private Node head;
    private Node tail;

    private int size = 0;

    public <T extends Animal> void enqueue(T animal) {
        Node newestNode = new Node(animal, null);
        if(head == null) {
            head = newestNode;
        } else {
            tail.next = newestNode;
        }
        tail = newestNode;
        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public Animal dequeueAny() {
        if(isEmpty())
            return null;
        Animal animal = head.data;
        head = head.next;
        size--;
        return animal;
    }

    public Animal dequeDog() {
        if(isEmpty())
            return null;
        if(head.data instanceof Dog) {
            Animal animal = head.data;
            head = head.next;
            size--;
            return animal;
        }

        Node temp = head;
        Animal animal = null;
        while (head.next != null) {
            if(head.next.data instanceof Dog) {
                animal = head.next.data;
            }
            head = head.next;
            if(animal != null) {
                size--;
                head = temp;
                return animal;
            }
        }
        head = temp;
        return null;
    }

    public void printData() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data.getType()+", ");
            temp = temp.next;
        }
        System.out.println();
    }




    private class Node<T extends Animal> {
        T data;
        Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

    }

}
