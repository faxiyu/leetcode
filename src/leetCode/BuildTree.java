package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 根据一棵树的中序遍历与后序遍历构造二叉树。
 * @author 14257
 *
 */
public class BuildTree {
	static Map<Integer, Integer> map = new HashMap<>();
	static int index;
	public static void main(String[] args) {
		int[] inorder = {9,3,15,20,7};
		int[] postorder = {9,15,7,20,3};
		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}
		index=postorder.length-1;
		TreeNode root = des(postorder,0,postorder.length-1);
		System.out.println(root.val);
	}

	private static TreeNode des( int[] postorder,int left,int right) {
		if (left>right) {
			return null;
		}
		
		int root=postorder[index];
		TreeNode a = new TreeNode(root);
		int r=map.get(root);
		index--;
		a.right=des(postorder,r+1,right);
		a.left=des(postorder,left,r-1);
		return a;
	}
}
