package leetCode;

import java.util.Arrays;

/**
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。
 * 你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回滑动窗口中的最大值。
 * @author 14257
 *
 */
public class MaxSlidingWindow {
	public static void main(String[] args) {
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k=3;
		int[] max = new int[nums.length-k+1];
		int index=0;
		max[0] = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			if (max[0]<=nums[i]) {
				max[0]=nums[i];
				index=i;
			}
		}
		for (int i = 1; i < max.length; i++) {
			if (index>=i) {
				if(nums[i+k-1]>=max[i-1]) {
					max[i] = nums[i+k-1];
					index=i+k-1;
				}else {
					max[i] = max[i-1];
				}
			}else {
				max[i] = Integer.MIN_VALUE;
				for (int j = i; j < i+k; j++) {
					if (max[i]<=nums[j]) {
						max[i]=nums[j];
						index=j;
					}
				}
			}
			
		}
		System.out.println(Arrays.toString(max));
	}
}
