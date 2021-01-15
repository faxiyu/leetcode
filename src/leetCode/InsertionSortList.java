package leetCode;
/**
 * 对链表进行插入排序。
 * @author 14257
 *
 */
public class InsertionSortList {
	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(3);
		ListNode sx = null;
		while(head!=null) {
			sx=paixu(sx,head.val);
			head =head.next;
		}
		System.out.println(sx.next.val);
	}

	private static ListNode paixu(ListNode sx, int val) {
		if (sx==null) {
			return new ListNode(val);
		}
		ListNode listNode = new ListNode(val);
		if (sx.val>val) {
			listNode.next=sx;
			return listNode;
		}else if(sx.val<=listNode.val && sx.next==null) {
			sx.next = listNode;
			return sx;
		}
		ListNode start  = sx;
		while(sx.next!=null) {
			if (sx.val<=listNode.val&&sx.next.val>listNode.val) {
				ListNode end = sx.next;
				sx.next = listNode;
				listNode.next = end;
				return start;
			}
			sx=sx.next;
		}
		sx.next = listNode;
		return start;
	}
}
