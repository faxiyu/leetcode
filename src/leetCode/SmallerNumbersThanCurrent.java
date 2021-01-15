package leetCode;


import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 * 换而言之，对于每个 nums[i] 你必须计算出有效的 j 的数量，其中 j 满足 j != i 且 nums[j] < nums[i] 。
 * 以数组形式返回答案
 * @author 14257
 *
 */
public class SmallerNumbersThanCurrent {
	public static void main(String[] args) {
		int[] nums = {8,1,2,2,3};
		int[] clone = nums.clone();
		Arrays.sort(nums);
		List<Integer> list =Arrays.stream(nums).boxed().collect(Collectors.toList());
		System.out.println(clone[0]);
		int[] leng = new int[clone.length];
		
		for (int i = 0; i < clone.length; i++) {
			leng[i]=list.indexOf(clone[i]);
		}
		System.out.println(leng[0]);
	}
}
