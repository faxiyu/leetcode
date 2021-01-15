package leetCode;

public class GetKthFromEnd {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		int k=2;
		int sum=1;
//		int count=0;
		ListNode a= head,b=head;
		while(b.next!=null) {
			if (sum<k) {
				b=b.next;
				sum++;
			}else {
				b=b.next;
				a=a.next;
			}
		}
//		while(a.next!=null) {
//			sum++;
//			a=a.next;
//		}
//		a=head;
//		while(sum-count!=k) {
//			count++;
//			a=a.next;
//		}
		System.out.println(a.val);
	}
}
