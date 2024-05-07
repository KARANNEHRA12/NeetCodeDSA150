package com.learn.dsa.linkedlist;

public class MergeKSortedList {


    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {
        // Create example lists
        ListNode[] lists = new ListNode[3]; // assuming you have 3 lists for testing
        // Initialize your lists with ListNode objects
        // For example:
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);
        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);
        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        // Call mergeKLists method
        ListNode mergedList = mergeKLists(lists);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        int size = lists.length;
        int interval = 1;
        while( interval < size){
            for ( int i =0 ; i< size - interval ; i+= 2 * interval){
                lists[i] = merge(lists[i], lists[i+ interval]);
            }
            interval *= 2;
        }
        return size > 0? lists[0]: null;


    } 
    public static ListNode merge( ListNode head1, ListNode head2){
//        -------------if two lists are not  sorted ----------
//        ListNode ansHead = new ListNode(0);
//        ListNode ansTail = ansHead;
//        while ( head1 != null && head2 != null){
//            if( head1.val <= head2.val){
//                ansTail.next = new ListNode(head1.val);
//                head1 = head1.next;
//
//            }
//            else{
//                ansTail.next = new ListNode(head2.val);
//                head2= head2.next;
//
//            }
//            ansTail = ansTail.next;
//
//        }
//        while( head1 != null){
//            ansTail.next = new ListNode(head1.val);
//            head1 = head1.next;
//            ansTail = ansTail.next;
//        }
//        while( head2 != null){
//            ansTail.next = new ListNode(head2.val);
//            head2 = head2.next;
//            ansTail = ansTail.next;
//        }
//        ListNode t1 = ansHead;
//        ansHead =ansHead.next;
//        t1.next = null;
//        return ansHead;
        
        
//        -------------if two lists are sorted ----------
        ListNode newhead = new ListNode(0);
        ListNode curr = newhead;
        while( head1 != null && head2 != null){
            if( head1.val <= head2.val){
                curr.next = head1;
                head1= head1.next;
            }
            else{
                curr.next = head2;
                head2 = head2.next;
            }
            curr= curr.next;
        }
        if(head1 !=null){
            curr.next = head1;
        }
        else{
            curr.next = head2;
        }

        return newhead.next;
    }
}
