class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public ListNode removeNthFromEnd(ListNode head, int n) {
   
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode p1 = dummy;
    ListNode p2 = dummy;
    
    // Move p2 n nodes ahead of p1
    for (int i = 0; i < n; i++) {
        p2 = p2.next;
    }
    
    // Move both pointers forward until p2 reaches the end of the list
    while (p2.next != null) {
        p1 = p1.next;
        p2 = p2.next;
    }
    
    // Remove the node that p1 is pointing to
    p1.next = p1.next.next;
    
    // Return the head of the list
    return dummy.next;
}
