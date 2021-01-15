package leetCode;
/**
 * ����һ��������������ÿ����㶼���һ�� 0-9 �����֣�ÿ���Ӹ���Ҷ�ӽڵ��·��������һ�����֡�
 * ���磬�Ӹ���Ҷ�ӽڵ�·�� 1->2->3 �������� 123��
 * ����Ӹ���Ҷ�ӽڵ����ɵ���������֮�͡�
 * ˵��: Ҷ�ӽڵ���ָû���ӽڵ�Ľڵ㡣
 * @author 14257
 *
 */
public class SumNumbers {
	static int sum=0;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left=new TreeNode(9);
		root.right=new TreeNode(0);
		root.left.left=new TreeNode(5);
		sums(root,0);
		System.out.println(sum);
	}

	private static void sums(TreeNode root, int i) {
		if (root==null) {
			return ;
		}
		i=root.val+i;			
		if (root.left==null&&root.right==null) {
			sum+=i;
			return ;
		}
		sums(root.left, i*10);
		sums(root.right, i*10);
		
		
	}
}
