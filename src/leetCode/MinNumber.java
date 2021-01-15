package leetCode;

import java.util.Arrays;

/**
 * ����һ���Ǹ��������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
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
