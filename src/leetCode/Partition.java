package leetCode;
/**
 * 给你一个链表和一个特定值 x ，请你对链表进行分隔，
 * 使得所有小于 x 的节点都出现在大于或等于 x 的节点之前。
 * 你应当保留两个分区中每个节点的初始相对位置。
 * @author 14257
 *
 */
public class Partition {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next=new ListNode(4);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(2);
		head.next.next.next.next=new ListNode(5);
		head.next.next.next.next.next=new ListNode(2);

		int x=3;
		ListNode min = new ListNode(0); 
		ListNode max = new ListNode(0);
		max.next = head;
		ListNode start = max;
		while(max.next!=null) {
			System.out.println(max.val);
			if (min.next==null&&max.next.val>=x) {
				min=max;
			}else if (min.next!=null&&max.next.val<x) {
				ListNode next = min.next;
				ListNode node = max.next.next;
				min.next=max.next;
				min.next.next=next;
				max.next=node;
				min=min.next;
				continue;
			}
			max=max.next;
			if (max==null) {
				break;
			}
		}
		System.out.println(ListNode.tostring(start));
	}
}
