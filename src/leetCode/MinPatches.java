package leetCode;
/**
 * 给定一个已排序的正整数数组 nums，和一个正整数 n 。从 [1, n] 区间内选取任意个数字补充到 nums 中，
 * 使得 [1, n] 区间内的任何数字都可以用 nums 中某几个数字的和来表示。
 * 请输出满足上述要求的最少需要补充的数字个数。
 * @author 14257
 *对于正整数 xx，如果区间 [1,x-1][1,x−1] 内的所有数字都已经被覆盖，且 xx 在数组中，则区间 [1,2x-1][1,2x−1] 内的所有数字也都被覆盖。
 */
public class MinPatches {
	public static void main(String[] args) {
		int[] nums = {1,3};
		int n=6;
		int patches = 0;
	    long x = 1;
	    int length = nums.length, index = 0;
	    while (x <= n) {
	    	if (index < length && nums[index] <= x) {
	    		x += nums[index];
	            index++;
	        } else {
	            x *= 2;
	            patches++;
	        }
	    	System.out.println(x+"  "+index);
	    }
	    System.out.println(patches);
	}
}
