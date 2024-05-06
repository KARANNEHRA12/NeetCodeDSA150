package com.learn.dsa.linkedlist;

public class MyDoublyLinkedList {
    DoublyNode<Integer> head;
    DoublyNode<Integer> tail;
    int size;

    MyDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    public void insertAtHead(int data) {
        DoublyNode<Integer> newNode = new DoublyNode<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;


    }

    public void insertAtTail(int data) {
        DoublyNode<Integer> newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        DoublyNode<Integer> temp = head;
        while (temp.next != null) { // temp will be on last node after this loop
            temp = temp.next;

        }
        temp.next = newNode;
        newNode.prev = temp;
        tail = newNode;
        size++;
    }

    public void insertAtPos(int data, int position) {
        if (position > size + 1 || position <= 0) {
            System.out.println("wrong index");

        } else if (position == 1) {
            insertAtHead(data);
        } else if (position == size + 1) {
            insertAtTail(data);
        } else {
            int count = 1;
            DoublyNode<Integer> newNode = new DoublyNode<>(data);
            DoublyNode<Integer> temp = head;
            while (count < position - 1 && temp != null) {
                count++;
                temp = temp.next;
            }
            DoublyNode<Integer> currPosNode = temp.next;
            newNode.next = currPosNode;
            currPosNode.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;

            size++;

        }


    }

    public void printList() {
        DoublyNode<Integer> temp = head;
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
    }

    public void printListinReverse() {
        DoublyNode<Integer> temp = tail;
        while (temp != null) {
            System.out.println(temp.data + "->");
            temp = temp.prev;
        }
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("invalid Node ");
            return;

        }
        DoublyNode<Integer> temp = head;
        head = head.next;
        temp.next = null;
        if (head == null) {
            tail = null;
        } else {
            head.prev =null;

        }

        size--;

    }

    public void deleteTail() {
        if (head == null) {
            System.out.println("invalid Node ");
            return;

        }
        // single node
        if (head.next == null) { // if there is only one node in linkedlist
            head = null;
            tail = null;
            size--;
        }
        DoublyNode<Integer> prevNode = null;
        DoublyNode<Integer> temp = head;
        while (temp.next != null) {
            prevNode = temp;
            temp = temp.next;

        }
        prevNode.next = null;
        temp.prev = null;tail= prevNode;
        size--;
    }

    public void deleteAtPos(int pos) {
        int count = 1;
        if (pos > size || pos <= 0) {
            System.out.println("invalid input");
            return;
        }
        if (pos == 0) {
            deleteHead();
        } else if (pos == size) {
            deleteTail();
        } else {
            DoublyNode<Integer>prevNode = null;
            DoublyNode<Integer> temp = head;
            while (count < pos & temp != null) {
                count++;
                prevNode = temp;
                temp = temp.next;
            }
            DoublyNode<Integer> nextNode = temp.next;
            prevNode.next = nextNode;
            nextNode.prev= prevNode;
            temp.prev= null;
            temp.next = null;
            size--;

        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtTail(10);
        ll.printList();
        ll.insertAtHead(11);
        ll.printList();
    }
}

class DoublyNode<T> {
    T data;
    DoublyNode next;
    DoublyNode prev;

    DoublyNode() {
        this.next = null;
        this.prev = null;
    }

    DoublyNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}