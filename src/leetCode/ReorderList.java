package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ�������� L��L0��L1������Ln-1��Ln ��
 * �����������к��Ϊ�� L0��Ln��L1��Ln-1��L2��Ln-2����
 * �㲻��ֻ�ǵ����ĸı�ڵ��ڲ���ֵ��������Ҫʵ�ʵĽ��нڵ㽻����
 * @author 14257
 *
 */
public class ReorderList {
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		if (head==null) {
			return ;
		}
        List<ListNode> list = new ArrayList<ListNode>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        int i = 0, j = list.size() - 1;
        while (i < j) {
            list.get(i).next = list.get(j);
            i++;
            if (i == j) {
                break;
            }
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
        System.out.println(head.next.val);
	}
}
