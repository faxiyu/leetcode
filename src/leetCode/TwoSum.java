package leetCode;

/**
 * ����һ����������������һ������s���������в�����������ʹ�����ǵĺ�������s������ж�����ֵĺ͵���s�����������һ�Լ��ɡ�
 * 
 * @author 14257
 *
 */
public class TwoSum {
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 22;
		int[] a=new int[2];
		int start=0,end=nums.length-1;
		while(start<end) {
			if (nums[start]+nums[end]<target) {
				start++;
			}else if (nums[start]+nums[end]>target) {
				end--;
			}else {
				
				System.out.println(nums[start]+" "+nums[end]);
				break;
			}
		}
		System.out.println(0);
	}
}
