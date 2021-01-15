package leetCode;
/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * @author 14257
 *
 */
public class MergeTwoLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		ListNode l = new ListNode(0);
		ListNode head = l;
		while(l1!=null&&l2!=null) {
			if (l1.val>l2.val) {
				head.next = new ListNode(l2.val);
				l2=l2.next;
			}else {
				head.next = new ListNode(l1.val);
				l1 = l1.next;
			}
			head=head.next;
		}
		if (l1==null)head.next= l2;
		else head.next= l1;
		System.out.println(l.next.next.val);
		
		
		
		
	}

	private static ListNode jiehe(ListNode l1, ListNode l2) {
		ListNode l ;
		if (l1==null) {
			return l2;
		}
		if (l2==null) {
			return l1;
		}
		if (l1.val>l2.val) {
			l=new ListNode(l2.val);
			l.next=jiehe(l1, l2.next);
		}else {
			l=new ListNode(l1.val);			
			l.next=jiehe(l1.next, l2);
		}
		return l;
	}
}
