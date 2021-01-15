package leetCode;

import java.util.ArrayList;
import java.util.List;

public class ReversePrint {
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		head.next=new ListNode(3);
		head.next.next=new ListNode(2);
		List<Integer> list = new ArrayList<>();
		while (head!=null) {
			list.add(head.val);
			head=head.next;
		}
		int[] a=new int[list.size()];
		for (int i = list.size()-1; i >=0; i--) {
			a[list.size()-1-i]=list.get(i);
		}
		System.out.println(a[2]);
		
	}
	
	
	
}

