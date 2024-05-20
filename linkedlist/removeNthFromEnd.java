package com.learn.dsa.linkedlist;

import java.util.List;

public class removeNthFromEnd {
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        while(n>0 ){
            second = second.next;
            n--;

        }
        while( second.next != null){
            second = second.next;
            first= first.next;
        }
        first.next = second;
        first.next = null;

        return head;

    }
}
