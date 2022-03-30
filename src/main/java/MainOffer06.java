import java.util.Stack;
/*
* 从尾到头打印链表(一定要想到栈(先进后出))
*
*
* */
public class MainOffer06 {
    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(3);
        listNode.next.next=new ListNode(2);

        System.out.println(reversePrint(listNode));
    }
    public static int[] reversePrint(ListNode head) {
        Stack<Integer>stack=new Stack<>();
        while(head!=null){
            stack.push(head.value);
            head=head.next;
        }
        int size= stack.size();
        int[]ints=new int[size];
         for(int i=0;i<size;i++){
             ints[i]=stack.pop();
         }
         return ints;
    }
}
