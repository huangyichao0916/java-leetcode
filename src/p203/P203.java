package p203;

public class P203 {
}

//class Solution {
//    public ListNode removeElements(ListNode head, int val) {
//        ListNode ln1 = new ListNode(1);
//        ln1.next = head;
//        ListNode newHead = ln1;
//        while(ln1.next != null){
//            if(ln1.next.val == val){
//                ln1.next = ln1.next.next;
//            }else{
//                ln1 = ln1.next;
//            }
//        }
//        return newHead.next;
//    }
//}