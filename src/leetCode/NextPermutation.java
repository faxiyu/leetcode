package leetCode;

import java.util.Arrays;

/**
 * 实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * 必须原地修改，只允许使用额外常数空间。
 * 以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 * @author 14257
 *
 */
public class NextPermutation {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int length = nums.length;
		for (int i = length-1; i >0; i--) {
			if (nums[i]>nums[i-1]) {
				for (int j = length-1; j >0; j--) {
					if (nums[i-1]<nums[j]) {
						int n = nums[j];
						nums[j]=nums[i-1];
						nums[i-1] = n;
						for (int k = i; k < (length+i)/2; k++) {
							int l = nums[k];
							nums[k] = nums[length+i-k-1];
							nums[length+i-k-1] = l;
						}
						return ;
					}
				}
				
			}
		}
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
	}
}
