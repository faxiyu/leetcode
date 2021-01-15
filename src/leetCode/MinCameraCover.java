package leetCode;
/**
 * ����һ�������������������Ľڵ��ϰ�װ����ͷ��
 * �ڵ��ϵ�ÿ����Ӱͷ�����Լ����丸����������ֱ���Ӷ���
 * �������������нڵ��������С����ͷ������
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
	 * ״̬ 0��root �����������ͷ������£�������������Ҫ������ͷ��Ŀ��
	 * ״̬ 1��������������Ҫ������ͷ��Ŀ������root �Ƿ��������ͷ��
	 * ״̬ 2����������������Ҫ������ͷ��Ŀ�����۽ڵ�root �����Ƿ񱻼�ص���
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