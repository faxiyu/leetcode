package leetCode;


import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

/**
 * ����һ������ nums����������ÿ��Ԫ�� nums[i]������ͳ�������б���С���������ֵ���Ŀ��
 * ������֮������ÿ�� nums[i] �����������Ч�� j ������������ j ���� j != i �� nums[j] < nums[i] ��
 * ��������ʽ���ش�
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
