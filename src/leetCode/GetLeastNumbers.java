package leetCode;

import java.util.Arrays;

/**
 * ������������ arr ���ҳ�������С�� k ���������磬����4��5��1��6��2��7��3��8��8�����֣�����С��4��������1��2��3��4��
 * @author 14257
 *
 */
public class GetLeastNumbers {
	public static void main(String[] args) {
		int[] arr = {3,2,1};
		int k=2;
		Arrays.sort(arr);
		int[] nums=Arrays.copyOf(arr, k);
		int a=59;
		Integer b=59;
		Integer c=Integer.valueOf(59);
		Integer d = new Integer(59);
		System.out.println(c==d);
		System.out.println(a==b);
		
	}
}