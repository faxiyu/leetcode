package leetCode;



/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。
 * 假设输入的数组的任意两个数字都互不相同。
 * @author 14257
 *
 */
public class VerifyPostorder {
	static boolean b=true;
	public static void main(String[] args) {
		int[] postorder = {4, 8, 6, 12, 16, 14, 10};
		pd(postorder,0,postorder.length-1);
		System.out.println(b);
	}

	private static void pd(int[] postorder,int i,int j) {
		if (i==j) {
			return ;
		}
		int p = i;
		int zp=j;
		int root = postorder[j];
		while(p<=j&&postorder[p]<root) p++;
		while(zp>0&&postorder[zp-1]>root) zp--;
		if (p!=zp) {
			b=false;
			return;
		}
		pd(postorder, i, p-1);
		pd(postorder, zp, j-1);
		
		
	}
}
