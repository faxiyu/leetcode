package leetCode;
/**
 * ����һ���������������������ڵĽڵ㣬�����ؽ����������
 * �㲻��ֻ�ǵ����ĸı�ڵ��ڲ���ֵ��������Ҫʵ�ʵĽ��нڵ㽻����
 * @author 14257
 *
 */
public class SwapPairs {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
//		head.next.next.next=new ListNode(4);
		ListNode h = jiaohuan(head);
		System.out.println(h.next.next.val);
	}

	private static ListNode jiaohuan(ListNode head) {
		if (head==null||head.next==null) {
			return head;			
		}
		int a=head.val;
		head.val=head.next.val;
		head.next.val=a;
		jiaohuan(head.next.next);
		return head;
	}
}
