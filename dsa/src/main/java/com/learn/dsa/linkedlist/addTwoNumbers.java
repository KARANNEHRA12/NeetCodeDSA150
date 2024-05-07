package com.learn.dsa.linkedlist;

public class addTwoNumbers {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode ptr = res;
         int carry =0;
         while( l1 != null || l2 != null){
             int sum = 0 + carry;
             if( l1 != null){
                 sum += l1.val;
                 l1= l1.next;

             }
             if( l2 != null){
                 sum += l2.val;
                 l2 = l2.next;
             }

             carry = sum /10;
             sum = sum % 10;
             ptr.next = new ListNode(sum);
             ptr= ptr.next;

         }
         if( carry == 1){
             ptr.next = new ListNode(1);

         }
          return res.next; //  bcz we have initial;ized res with 0 so we need top remove this from answer

    }
}
