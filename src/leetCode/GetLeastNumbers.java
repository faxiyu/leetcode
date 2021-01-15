package leetCode;

import java.util.Arrays;

/**
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
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