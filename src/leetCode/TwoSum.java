package leetCode;

/**
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * 
 * @author 14257
 *
 */
public class TwoSum {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 22;
		int[] a=new int[2];
		int start=0,end=nums.length-1;
		while(start<end) {
			if (nums[start]+nums[end]<target) {
				start++;
			}else if (nums[start]+nums[end]>target) {
				end--;
			}else {
				
				System.out.println(nums[start]+" "+nums[end]);
				break;
			}
		}
		System.out.println(0);
	}
}
