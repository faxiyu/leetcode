package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ����������λ�������ǰ�벿�֣�����ż��λ������ĺ�벿�֡�
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
