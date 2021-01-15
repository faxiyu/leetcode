package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组，判断是否存在重复元素。
如果任意一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 
 * @author 14257
 *
 */
public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums= {1,2,3,1};
		Set<Integer> set = new HashSet(); 
		if (nums.length<=1) {
			System.out.println(false);
//			return false;
		}
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i]==nums[i-1]) {
				System.out.println(true);
//				return true;
			}
		}
		System.out.println(false);
//		return false;
	}
}
