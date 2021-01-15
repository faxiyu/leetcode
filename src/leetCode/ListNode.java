package leetCode;

public class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
	public static String tostring(ListNode head) {
		String s = "";
		while(head!=null) {
			s+=head.val+" ";
			head=head.next;
		}
		return s;
	}
}