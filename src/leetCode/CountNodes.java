package leetCode;


/**
 * 完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，
 * 并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含 1~ 2h 个节点。
 * @author 14257
 *
 */
public class CountNodes {
	static int max = 0;
	static int res = 0;
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left=new TreeNode(2);
		root.right= new TreeNode(3);
		root.left.left= new TreeNode(4);
		root.left.right= new TreeNode(5);
		root.right.left = new TreeNode(6);
		findMax(root,1);
		int pow =(int) Math.pow(2, max-1);
//		return pow-1+res;
		
	}

	private static void findMax(TreeNode root,int count) {
		if (root.left!=null) {
			count++;
			findMax(root.left,count);
			count--;
		}
		if (root.right!=null) {
			count++;
			findMax(root.right,count);
			count--;
		}
		if (root.left==null&&root.right==null) {
			if (max<=count) {
				max=count;
				res++;
			}else {
				return ;
			}
		}
		
		
	}
}
