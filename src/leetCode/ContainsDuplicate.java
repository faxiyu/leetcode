package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * ����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء�
�������һֵ�������г����������Σ��������� true �����������ÿ��Ԫ�ض�����ͬ���򷵻� false 
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
