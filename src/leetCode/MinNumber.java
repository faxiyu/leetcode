package leetCode;

import java.util.Arrays;

/**
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 
 * @author 14257
 *
 */
public class MinNumber {
	public static void main(String[] args) {
		int[] nums = { 20,1 };
		String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++) { 
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder res = new StringBuilder();
        for(String s : strs) {
            res.append(s);
        }
        System.out.println(res.toString()); 
    }

}
