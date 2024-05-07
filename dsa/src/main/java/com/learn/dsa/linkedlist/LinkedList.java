package com.learn.dsa.linkedlist;

public class LinkedList {
    Node<Integer> head;
    int size;
     LinkedList(){
         this.head = null;
         this.size =0;

     }
     public void insertAtHead(int data){
         Node<Integer> newNode = new Node(data);
         if( head == null){
             head = newNode;
             size++;
            return;
             }
             newNode.next= head;
             head = newNode;
             size++;


     }
     public void insertAtTail(int data){
         Node<Integer> newNode = new Node(data);
         if( head == null){
             head = newNode;
             size++;
             return;
         }
         Node<Integer> temp = head;
         while( temp.next != null){ // temp will be on last node after this loop
             temp = temp.next;

         }
         temp.next = newNode;
         size++;
     }
      public void insertAtPos(int data, int position){
          if( position > size + 1 || position <=0) {
              System.out.println("wrong index");

          }else if(position ==1 ){
             insertAtHead(data);
         }
         else if(position == size +1 ){
             insertAtTail(data);
         }else{
              int count =1;
              Node<Integer> newNode = new Node<>(data);
              Node<Integer> temp = head;
              while( count < position -1 && temp != null){
                  count++;
                  temp = temp.next;
              }
              newNode.next = temp.next;
              temp.next= newNode;
              size++;

          }



      }
      public void printList(){
         Node<Integer> temp = head;
         while( temp != null){
             System.out.println(temp.data + "->");
             temp= temp.next;
         }
      }
      public void deleteHead(){
          if( head == null){
              System.out.println("invalid Node ");
              return;

          }
          Node<Integer> temp = head;
          head = head.next;
          temp.next = null;
          size--;

      }
      public void deleteTail(){
          if( head == null){
              System.out.println("invalid Node ");
              return;

          }
          if( head.next == null){ // if there is only one node in linkedlist
              head = null;
              size--;
          }
          Node<Integer> prev = null;
          Node<Integer> temp = head;
          while (temp.next != null){
              prev = temp;
              temp= temp.next;

          }
           prev.next = null;
          size--;
      }
      public void deleteAtPos(int pos){
         int count =1;
         if(pos > size || pos <=0){
             System.out.println("invalid input");
             return;
         }
         if( pos ==0){
             deleteHead();
         }else if(pos == size){
             deleteTail();
         }
         else{
             Node<Integer> prev = null;
             Node<Integer> temp = head;
             while (count < pos & temp != null){
                 count++;
                 prev=temp;
                 temp= temp.next;
             }
             prev.next= temp.next;
             temp.next= null;
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

class Node<T> {
    T data;
    Node next;

    Node(){
        this.next= null;
    }
    Node(T data){
        this.data = data;
        this.next = null;
    }
}
