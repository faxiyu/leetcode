package leetCode;
/**
 * ����һ��������������Binary Search Tree����
 * ����ת����Ϊ�ۼ�����Greater Tree)��
 * ʹ��ÿ���ڵ��ֵ��ԭ���Ľڵ�ֵ�������д������Ľڵ�ֵ֮�͡�
 * @author 14257
 *
 */
public class ConvertBST {
	static int sum=0;
	public static void main(String[] args) {
		TreeNode root= new TreeNode(5);
		root.left=new TreeNode(13);
		root.right=new TreeNode(2);
		TreeNode r = c(root);
		System.out.println(r.left.val);
	}

	private static TreeNode c(TreeNode root) {
		if (root!=null) {
			c(root.right);
			sum+=root.val;
			root.val=sum;
			c(root.left);
		}
		return root;
	}
}
