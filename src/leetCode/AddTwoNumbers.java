package leetCode;



/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * @author 14257
 *
 */
public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next= new ListNode(4);
		
		ListNode l = add(l1,l2,false);
		System.out.println(l.next.next.val);
		}

	private static ListNode add(ListNode l1, ListNode l2,boolean b) {
		if (l1==null&&l2==null) {
			if (b) 	return new ListNode(1);
			else return null;
		}else {
			if(l1==null) l1=new ListNode(0);
			if(l2==null) l2=new ListNode(0);
		}
		int i1=l1.val;
		int i2=l2.val;
		int sum=i1+i2;
		if (b)	sum+=1;
		if (sum>=10) b=true;
		else b=false;
		ListNode l = new ListNode(sum%10);
		l.next=add(l1.next,l2.next,b);
		return l;
		
	}
}
