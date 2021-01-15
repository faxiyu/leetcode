package leetCode;

import java.util.Arrays;
import java.util.Comparator;

public class MoveZeroes {
	public static void main(String[] args) {
		int [] nums = {0,1,0,13,12};
		int a=0;
		int b=0;
		for (; a < nums.length||b<nums.length;) {
			if (a<nums.length&&nums[a]==0) {
				a++;
				continue;
			}else if(a<nums.length) {
				nums[b]=nums[a];
				a++;
				b++;
				continue;
			}
			if (a==nums.length) {
				nums[b]=0;
				b++;
			}
			
		}
		System.out.println(Arrays.toString(nums));
	}
}
