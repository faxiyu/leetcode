package leetCode;

import java.util.Arrays;

/**
 * ʵ�ֻ�ȡ��һ�����еĺ������㷨��Ҫ���������������������г��ֵ�������һ����������С�
 * �����������һ����������У��������������г���С�����У����������У���
 * ����ԭ���޸ģ�ֻ����ʹ�ö��ⳣ���ռ䡣
 * ������һЩ���ӣ�����λ������У�����Ӧ���λ���Ҳ��С�
 * 1,2,3 �� 1,3,2
 * 3,2,1 �� 1,2,3
 * 1,1,5 �� 1,5,1
 * @author 14257
 *
 */
public class NextPermutation {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int length = nums.length;
		for (int i = length-1; i >0; i--) {
			if (nums[i]>nums[i-1]) {
				for (int j = length-1; j >0; j--) {
					if (nums[i-1]<nums[j]) {
						int n = nums[j];
						nums[j]=nums[i-1];
						nums[i-1] = n;
						for (int k = i; k < (length+i)/2; k++) {
							int l = nums[k];
							nums[k] = nums[length+i-k-1];
							nums[length+i-k-1] = l;
						}
						return ;
					}
				}
				
			}
		}
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
	}
}
