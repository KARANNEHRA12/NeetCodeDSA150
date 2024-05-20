package com.learn.dsa.linkedlist;

public class reverseKGroup {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public int len(ListNode head){
        int count=0;
        ListNode curr = head;
        while ( curr !=null){
            curr= curr.next;
            count++;
        }
        return count;
  }
    public ListNode reverseKGroup(ListNode head, int k) {
        int n = len(head);
        int groups =n/k;
        ListNode prevHead = null;
        ListNode currHead = head;
        ListNode ansNode = null;
        for (int i = 0; i < groups ; i++) {
            ListNode prev = null;
            ListNode curr = currHead;
            ListNode nextNode = null;
//            Reverse k groups/
            for( int j =0 ; j< k ; j++){
                nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;

            }
            if( prevHead == null){
                ansNode = prev;

            }
            else{
                prevHead.next = prev;
            }
            prevHead = currHead;
            currHead = curr;

        }
        // link last incopmplete group if last group wa complete
//        currhead would be null
        prevHead.next= currHead;
         return ansNode;
    }
}
