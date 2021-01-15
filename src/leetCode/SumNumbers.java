package leetCode;
/**
 * 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
 * 例如，从根到叶子节点路径 1->2->3 代表数字 123。
 * 计算从根到叶子节点生成的所有数字之和。
 * 说明: 叶子节点是指没有子节点的节点。
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
