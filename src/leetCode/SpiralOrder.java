package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * @author 14257
 *
 */
public class SpiralOrder {
	public static void main(String[] args) {
//		int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] matrix= {};
		if (matrix.length==0) {
			System.out.println(-1);
			return ;
		}
		int sum=0;
		int lmin=0;
		int lmax=matrix[0].length;
		int hmin=0;
		int hmax=matrix.length;
		int c=0;
		int al=0;
		int[] num=new int[matrix.length*matrix[0].length];
		int[][] a= {{0,1},{1,0},{0,-1},{-1,0}}; 
		boolean b=true;
		for(int i=0,j=0;sum<matrix.length*matrix[0].length;) {
			if (b) {
				num[sum]=matrix[i][j];
				System.out.println(matrix[i][j]);
				sum++;	
			}
			if (sum-c==(lmax-lmin)*2+(hmax-hmin)*2-4&&sum!=c) {
				c=sum;
				lmax--;
				lmin++;
				hmax--;
				hmin++;
			}
			if (hmin<=i+a[al][0]&&i+a[al][0]<hmax&&lmin<=j+a[al][1]&&j+a[al][1]<lmax) {
				i+=a[al][0];
				j+=a[al][1];
				b=true;
				
			}else {
				al++;
				al=al%4;
				b=false;
				
			}
		}
		
		System.out.println(num[10]);
	}
	
}
