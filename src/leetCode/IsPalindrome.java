package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 请判断一个链表是否为回文链表。
 * @author 14257
 *
 */
public class IsPalindrome {
	public static void main(String[] args) {
		ListNode head = new ListNode(-129);
		head.next = new ListNode(-129);
		List<Integer> list = new ArrayList<>();
		while(head!=null) {
			list.add(head.val);
			head=head.next;
		}
		System.out.println(list.toString());
		for (int i = 0,j=list.size()-1; i <j ; i++,j--) {
			int a = list.get(i);
			int b = list.get(j);
			if (a!=b) {
				System.out.println(false);
				return ;
			}
		}
		System.out.println(true);
		return ;
		
	}
}
