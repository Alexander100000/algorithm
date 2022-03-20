public class MainOffer024 {
//    反转链表（递归的思维）
    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        System.out.println(reverseList(listNode));
    }
    public static ListNode reverseList(ListNode head){
//        防止越界(注意递归的思维你要咋么递归然后很好解决问题)
        if(head==null||head.next==null)return head;
        ListNode listNode=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return listNode;
    }
}
class ListNode{
    int value;
    ListNode next;
    public ListNode(){

    }
    public ListNode(int value){
        this.value=value;
    }
    public ListNode(int value,ListNode next){
        this.next=next;
    }
}