package leetCode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * @author 14257
 *
 */
public class ReverseList {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		Deque<Integer> stack = new ArrayDeque<>();
		ListNode h1 = head;
		while (h1!=null) {
			stack.push(h1.val);
			h1=h1.next;
		}
		ListNode h = dao(stack);
		System.out.println(h.next.val);

	}

	private static ListNode dao(Deque<Integer> stack) {
		if (!stack.isEmpty()) {
			ListNode h1= new ListNode(stack.pop());
			h1.next=dao(stack);
			return h1;
		}else {
			return null;
		}
	}
}
