package leetCode;

import java.util.Arrays;

/**
 * ������һЩ�����������ȣ���ɵ����� A����������������������ɵġ������Ϊ��������ε�����ܳ���
 * ��������γ��κ������Ϊ��������Σ����� 0��
 * @author 14257
 *
 */
public class LargestPerimeter {
	public static void main(String[] args) {
		int[] A= {3,2,3,4};
		if (A.length<3) {
			System.out.println(0);
			return ;
		}
		Arrays.sort(A);
		for (int i = A.length-3; i >= 0; i--) {
			if(A[i]+A[i+1]>A[i+2]) {
				System.out.println(A[i]+A[i+1]+A[i+2]);
				return ;
			}
		}
	}
}
