package leetCode;
/**
 * 有一个二维矩阵 A 其中每个元素的值为 0 或 1 。
移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
返回尽可能高的分数。
 * @author 14257
 *
 */
public class MatrixScore {
	public static void main(String[] args) {
		int[][] A= {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
		for (int i = 0; i < A[0].length; i++) {
			int count=0;
			for (int j = 0; j < A.length; j++) {
				if (i==0&&A[j][i]==0) {
					for (int k = 0; k < A[0].length; k++) 
						A[j][k]=(A[j][k]+1)%2;
				}
				if (i>0) {
					if (A[j][i]==0) count--;
					else count++;
				}
			}
			if(count<0){
				for (int j = 0; j < A.length; j++) 
					A[j][i]=(A[j][i]+1)%2;
			}
		}
		int sum=0;
		for (int i = 0; i < A.length; i++) {
			sum+=tovalue(A[i]);
		}
		System.out.println(sum);
	}

	private static int tovalue(int[] is) {
		int num = is.length-1;
		int value=0;
		for (int i = num; i >=0; i--) {
			value+=is[i]*Math.pow(2,num-i);
		}
		return value;
	}
}
