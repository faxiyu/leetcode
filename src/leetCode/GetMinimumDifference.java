package leetCode;
/**
 * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
 * @author 14257
 *
 */
public class GetMinimumDifference {
	static int min=Integer.MAX_VALUE;
	static int bool=-1;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.right=new TreeNode(3);
		root.right.left=new TreeNode(2);
		zxbl(root);
		System.out.println(min);
		
	}

	private static void zxbl(TreeNode root) {
		if (root==null) {
			return ;
		}
		zxbl(root.left);
		if (bool==-1) {
			bool=root.val;
		}else {
			min=Math.min(min, root.val-bool);
			bool=root.val;
		}
		zxbl(root.right);
		
	}
}
