/*
* 判断链表有无环
*
* */
public class Main141 {
    public static void main(String[] args) {
        ListNode node5=new ListNode(1,null);
        ListNode node4=new ListNode(1,node5);
        ListNode node3=new ListNode(1,node4);
        ListNode node2=new ListNode(1,node3);
        ListNode node1=new ListNode(1,node2);
        node5.next=node3;
        System.out.println(hasCycle(node1));
    }
    public static boolean hasCycle(ListNode head){
        if(head==null)return false;
        ListNode l1=head;
        ListNode l2 = l1.next;
//        这个没什么难度只要把迭代的条件搞出来就可以
        while(l2!=null&&l2.next!=null){
            if(l1==l2){
                return true;
            }
//            要是不符合条件让引用指向下一个元素（图形结合最容易理解）
            l1=l1.next;
            l2=l2.next.next;
        }
        return false;
    }
}
