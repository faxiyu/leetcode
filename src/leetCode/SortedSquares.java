package leetCode;

import java.util.Arrays;

/**
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * @author 14257
 *
 */
public class SortedSquares {
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(s.indexOf('a'));
		int[] A = {-7,-3,2,3,11};
		int[] a = new int[A.length];
		for (int i = 0,j=A.length-1,z=A.length-1; i <= j; ) {
			if (A[i]*A[i]>A[j]*A[j]) {
				a[z]=A[i]*A[i];
				i++;
			}else {
				a[z]=A[j]*A[j];
				j--;
			}
			z--;
		}
		System.out.println(a[0]);
		
		
		
//		for (int i = 0; i < A.length; i++) {
//			A[i]=A[i]*A[i];
//			
//		}
//		Arrays.sort(A);
//		System.out.println(A[0]);
		
		
		
		
	}
}
