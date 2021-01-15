package leetCode;

import java.util.Arrays;

/**
 * 给定一个 n × n 的二维矩阵表示一个图像。
将图像顺时针旋转 90 度。
 * @author 14257
 *
 */
public class Rotate {
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},
				  {4,5,6},
				  {7,8,9}};
		int length = matrix.length;
		boolean[][] b = new boolean[matrix.length][matrix[0].length];
		int count=0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (!b[i][j]) {
					int num=matrix[i][j];
					matrix[i][j]=matrix[length-1-j][i];
					matrix[length-1-j][i]=matrix[length-1-i][length-1-j];
					matrix[length-1-i][length-1-j]=matrix[j][length-1-i];
					matrix[j][length-1-i]=num;
					b[i][j]=true;
					b[j][length-1-i]=true;
					b[length-1-i][length-1-j]=true;
					b[length-1-j][i]=true;
					count+=1;
				}
				if (count==length*length/4) {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(matrix[0]));
	}
}
