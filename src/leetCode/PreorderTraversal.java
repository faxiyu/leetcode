package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的 前序 遍历。
 * @author 14257
 *
 */
public class PreorderTraversal {
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
			TreeNode root = new TreeNode(1);
			root.right = new TreeNode(2);
			root.right.left = new TreeNode(3);
			qianxu(root);
			
			
	}

	private static void qianxu(TreeNode root) {
		if (root==null) {
			return ; 
		}
		list.add(root.val);
		qianxu(root.left);
		qianxu(root.right);
	}
}
