package leetCode;

import java.util.Arrays;
import java.util.Collections;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
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
