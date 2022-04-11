import java.util.LinkedHashSet;
import java.util.Vector;

public class MainHot02 {
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);
        System.out.println(addTwoNumbers(l1, l2));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode=new ListNode(-1);
//      存储进位的
        int index=0;
        ListNode as=listNode;
        while(l1!=null||l2!=null||index!=0){
            int l1Val=l1==null?0:l1.value;
            int l2Val=l1==null?0:l2.value;
            int sub=l1Val+l2Val+index;
            index=sub/10;
            ListNode root=new ListNode(sub%10);
            as.next=root;
            as=root;
            if(l1!=null)l1=l1.next;
            if (l2!=null)l2=l2.next;

        }

        return listNode.next;
    }
}
