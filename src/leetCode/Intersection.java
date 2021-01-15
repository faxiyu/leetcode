package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * @author 14257
 *
 */
public class Intersection {
	public static void main(String[] args) {
		int[] nums1= {4,9,5};
		int[] nums2= {9,4,9,8,4};
		jiaoji(nums1,nums2);
		
	}

	private static void jiaoji(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i=0,j=0;
		for ( i = 0,j=0; i < nums1.length&&j<nums2.length;) {
			if (i!=0&&nums1[i]==nums1[i-1]) {
				i++;
			}else {
				if (j!=0&&nums2[j]==nums2[j-1]) {
					j++;
					continue;
				}
				if (nums1[i]==nums2[j]) {
					list.add(nums1[i]);
					i++;
					j++;
				}else if(nums1[i]>nums2[j]) {
					j++;
				}else {
					i++;
				}
			}
		}
		int[] a = list.stream().mapToInt(Integer::valueOf).toArray();
		System.out.println(Arrays.toString(a));
		
	}}
