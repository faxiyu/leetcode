package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ������������������ ǰ�� ������
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
