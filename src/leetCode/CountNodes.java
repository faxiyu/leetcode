package leetCode;


/**
 * ��ȫ�������Ķ������£�����ȫ�������У�������ײ�ڵ����û�����⣬����ÿ��ڵ������ﵽ���ֵ��
 * ����������һ��Ľڵ㶼�����ڸò�����ߵ�����λ�á�����ײ�Ϊ�� h �㣬��ò���� 1~ 2h ���ڵ㡣
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
