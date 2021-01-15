package leetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * @author 14257
 *
 */
public class MajorityElement {
	public static void main(String[] args) {
		int[] nums= {1, 2, 3, 2, 2, 2, 5, 4, 2};

		//3 摩尔投票
		int z=nums[0];
		int sum=0;
		for (int i = 0; i < nums.length; i++) {
			if (sum==0) z=nums[i];
			if (nums[i]!=z) {
				sum--;
			}else {
				sum++;
			}
		}
		System.out.println(z);
		
		
		
		//2
//		Arrays.sort(nums);
//		System.out.println(nums[nums.length/2]);
		
		//1
//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for (int i : nums) {
//			map.put(i, map.getOrDefault(i, 0)+1);
//		}
//		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
//		for (Entry<Integer, Integer> entry : entrySet) {
//			if (entry.getValue()>nums.length/2) {
//				System.out.println(entry.getKey());
//				break;
//			}
//		}
	}
}
