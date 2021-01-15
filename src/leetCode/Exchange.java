package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 * @author 14257
 *
 */
public class Exchange {
	public static void main(String[] args) {
		int[] nums= {2,16,3,5,13,1,16,1,12,18,11,8,11,11,5,1};
		int o=nums.length-1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i]%2==0) {
				for (int j = 0; j < nums.length; j++) {
					if (nums[o]%2==0) {
						o--;
					}else {
						break;
					}
				}
				if (i>=o) {
					break;
				}
				int temp=nums[i];
				nums[i]=nums[o];
				nums[o]=temp;				
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+"  ");
		}
	}
}
