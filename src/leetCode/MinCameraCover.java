package leetCode;
/**
 * 给定一个二叉树，我们在树的节点上安装摄像头。
 * 节点上的每个摄影头都可以监视其父对象、自身及其直接子对象。
 * 计算监控树的所有节点所需的最小摄像头数量。
 * @author 14257
 *
 */
public class MinCameraCover {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		root.left=new TreeNode(0);
		root.right=null;
		root.left.left=new TreeNode(0);
		root.left.right=new TreeNode(0);
		int[] a=dfs(root);
		System.out.println(a[1]);
		
	}
	/**
	 * 状态 0：root 必须放置摄像头的情况下，覆盖整棵树需要的摄像头数目。
	 * 状态 1：覆盖整棵树需要的摄像头数目，无论root 是否放置摄像头。
	 * 状态 2：覆盖两棵子树需要的摄像头数目，无论节点root 本身是否被监控到。
	 * @param root
	 * @return
	 */
	public static int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[]{Integer.MAX_VALUE / 2, 0, 0};
        }
        int[] leftArray = dfs(root.left);
        int[] rightArray = dfs(root.right);
        int[] array = new int[3];
        array[0] = leftArray[2] + rightArray[2] + 1;
        array[1] = Math.min(array[0], Math.min(leftArray[0] + rightArray[1], rightArray[0] + leftArray[1]));
        array[2] = Math.min(array[0], leftArray[1] + rightArray[1]);
        return array;
    }

}