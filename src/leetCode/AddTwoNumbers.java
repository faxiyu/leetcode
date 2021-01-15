package leetCode;



/**
 * �������� �ǿ� ������������ʾ�����Ǹ������������У����Ǹ��Ե�λ���ǰ��� ���� �ķ�ʽ�洢�ģ��������ǵ�ÿ���ڵ�ֻ�ܴ洢 һλ ���֡�
 * ��������ǽ��������������������᷵��һ���µ���������ʾ���ǵĺ͡�
 * �����Լ���������� 0 ֮�⣬���������������� 0 ��ͷ��
 * @author 14257
 *
 */
public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next= new ListNode(4);
		
		ListNode l = add(l1,l2,false);
		System.out.println(l.next.next.val);
		}

	private static ListNode add(ListNode l1, ListNode l2,boolean b) {
		if (l1==null&&l2==null) {
			if (b) 	return new ListNode(1);
			else return null;
		}else {
			if(l1==null) l1=new ListNode(0);
			if(l2==null) l2=new ListNode(0);
		}
		int i1=l1.val;
		int i2=l2.val;
		int sum=i1+i2;
		if (b)	sum+=1;
		if (sum>=10) b=true;
		else b=false;
		ListNode l = new ListNode(sum%10);
		l.next=add(l1.next,l2.next,b);
		return l;
		
	}
}
