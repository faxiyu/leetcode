package leetCode;
/**
 * ����һ�������һ���ض�ֵ x �������������зָ���
 * ʹ������С�� x �Ľڵ㶼�����ڴ��ڻ���� x �Ľڵ�֮ǰ��
 * ��Ӧ����������������ÿ���ڵ�ĳ�ʼ���λ�á�
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
