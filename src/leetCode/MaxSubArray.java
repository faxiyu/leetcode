package leetCode;
/**
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * @author 14257
 *
 */
public class MaxSubArray {
	public static void main(String[] args) {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		int sum=0;
		int max=nums[0];
		for (int i : nums) {
			sum+=i;
			max=Math.max(max, sum);
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(max);
	}
}
