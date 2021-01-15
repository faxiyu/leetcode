package leetCode;

import java.util.Arrays;

public class MaximumGap {
	public static void main(String[] args) {
		int[] nums = {3,6,9,1};
		if (nums.length<2) {
			System.out.println(0);
			return ;
		}
		Arrays.sort(nums);
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i+1]-nums[i]>max) {
				max=nums[i+1]-nums[i];
			}
		}
		System.out.println(max);
	}
}
