package leetCode;
/**
 * ���������ͷ��� head ���뽫�䰴 ���� ���в����� ���������� ��
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
