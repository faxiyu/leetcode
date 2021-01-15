package leetCode;

import java.util.Arrays;
import java.util.Collections;

/**
 * ����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ�����
 * @author 14257
 *
 */
public class Rotate1 {
	public static void main(String[] args) {
		int[] nums= {-1,-100,3,99};
		int k=2;
		if (k==0||nums.length==0) {
			return ;
		}
		k=k%nums.length;
		reverse(0,nums.length-1,nums);
		reverse(0,k-1,nums);
		reverse(k,nums.length-1,nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void reverse(int start, int end, int[] nums) {
		while(start<end) {
			int k = nums[start];
			nums[start]  = nums[end];
			nums[end] = k;
			end--;
			start++;
		}
		
	}
}
