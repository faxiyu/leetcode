package leetCode;
/**
 * 给定一个二叉搜索树（Binary Search Tree），
 * 把它转换成为累加树（Greater Tree)，
 * 使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
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
