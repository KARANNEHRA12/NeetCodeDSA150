package com.learn.dsa.linkedlist;

import ch.qos.logback.core.read.ListAppender;

public class reorderList {
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

        public void reorderList(ListNode head) {
        // finding the separation point
            ListNode slow = head;
            ListNode fast= head.next;
            while( fast != null && fast.next!= null){
                slow = slow.next;
                fast = fast.next.next;
            }
            // slow pointer is at last node of first part
            ListNode second = slow.next;
            // now reverse the second part
            ListNode prev = slow.next = null;
            while(second != null){
                ListNode temp = second.next;
                second.next = prev;
                prev =second;
                second = temp; // here prev will be head of the reversed list
            }

//             merge halves according to the question
            ListNode first = head;
            second  = prev;
            while( second != null){
                ListNode temp1 = first.next;
                ListNode temp2 = second.next;
                first.next = second;
                second.next = temp1;
                first = temp1;
                second = temp2;
            }

        }
    }
