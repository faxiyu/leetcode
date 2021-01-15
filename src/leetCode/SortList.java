package leetCode;
/**
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 * @author 14257
 *
 */
public class SortList {
	public static void main(String[] args) {
		ListNode head = new ListNode(4);
		head.next = new ListNode(2);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(3);
		if (head==null) {
			return ;
		}
		ListNode jiaHead =new ListNode(0);
		jiaHead.next=head;
		ListNode lastSort = head;
		ListNode luan = head.next;
		while(luan!=null) {
			if (luan.val>=lastSort.val) {
				lastSort=lastSort.next;
			}else {
				ListNode var = jiaHead;
				while(var.next.val<=luan.val) {
					var=var.next;
				}
				lastSort.next = luan.next;
				luan.next = var.next;
				var.next = luan;
			}
			luan=lastSort.next;
		}
		
		
	}
}
