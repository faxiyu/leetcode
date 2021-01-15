package leetCode;



/**
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @author 14257
 *
 */
public class FindNumberIn2DArray {
	static int h=0;
	static int l=0;
	static boolean b=false;
	public static void main(String[] args) {

		int[][] matrix= {{1,   4,  7, 11, 15},
				  		{2,   5,  8, 12, 19},
				  		{3,   6,  9, 16, 22},
				  		{10, 13, 14, 17, 24},
				  		{18, 21, 23, 26, 30}};
		int target=5;
		int n=matrix.length;
		h=n-1;
		hang(matrix,target);
		lie(matrix,target);
		System.out.println(b);
		return ;
	}
	private static void hang(int[][] matrix,int target) {
		int n=matrix.length;
		for (int i = 0; i < h+1; i++) {
			if (matrix[i][l]>target) {
				h=i-1;
				return ;
			}else if (matrix[i][l]==target) {
				b=true;
				return ;
			}
		}
	}
	private static void lie(int[][] matrix, int target) {
		int m= matrix[0].length;
		for (int i = 0; i < m; i++) {
			if (matrix[h][i]>target) {
				l=i;
				hang(matrix, target);
				return ;
			}else if (matrix[h][i]==target) {
				b=true;
				return ;
			}
		}
	}
}
