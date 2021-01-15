package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 * @author 14257
 *
 */
public class PathSum {
	static List<List<Integer>> l = new ArrayList<>();
	static List<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left=new TreeNode(4);
		root.right=new TreeNode(8);
		root.left.left=new TreeNode(11);
		root.right.left=new TreeNode(13);
		root.right.right=new TreeNode(4);
		root.left.left.left=new TreeNode(7);
		root.left.left.right=new TreeNode(2);
		root.right.right.left=new TreeNode(5);
		root.right.right.right=new TreeNode(1);
		int sum=22;
		des(root,0,sum);
		System.out.println(l.toString());
	}
	private static void des(TreeNode root, int i, int sum) {
		if (root==null) {
			return ;
		}
		list.add(root.val);
		i+=root.val;
		if (root.left==null&&root.right==null&&i==sum) {
			l.add(new ArrayList<>(list));
			list.remove(list.size()-1);
			return ;
		}
		des(root.left, i, sum);
		des(root.right, i, sum);
		list.remove(list.size()-1);
	}
}
