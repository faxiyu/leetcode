package leetCode;
/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * @author 14257
 *
 */
public class LowestCommonAncestor {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(6);
		root.left=new TreeNode(2);
		root.right=new TreeNode(8);
		root.left.left=new TreeNode(0);
		root.left.right=new TreeNode(4);
		root.right.left=new TreeNode(7);
		root.right.right=new TreeNode(9);
		root.left.right.left=new TreeNode(3);
		root.left.right.right=new TreeNode(5);
		int p=2;
		int q=4;
		while(true) {
			if (p<=root.val&&q>=root.val||p>=root.val&&q<=root.val||p==root.val||q==root.val) {
				System.out.println(root.val);
				return ;
			}else if (p<root.val) {
				root=root.left;
			} else {
				root=root.right;
			}
		}
//		while(true) {
//			if (root.val==p||root.val==q) {
//				System.out.println(root.val);
//				return ;
//			}
//			int leftnum=find(root.left,p,q);
//			int rightnum=find(root.right,p,q);
//			if (leftnum==rightnum) {
//				System.out.println(root.val);
//				return ;
//			}else if (leftnum>rightnum) {
//				root=root.left;
//			}else {
//				root=root.right;
//			}
//		}
//	}
//
//	private static int find(TreeNode root, int p, int q) {
//		if (root==null) {
//			return 0;
//		}
//		if (root.val==p||root.val==q) {
//			return 1;
//		}
//		int sum=0;
//		sum+=find(root.left, p, q);
//		sum+=find(root.right, p, q);
//		return sum;
	}
}
