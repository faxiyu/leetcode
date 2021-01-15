package leetCode;

import java.util.Arrays;

/**
 * �������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
 * ����һ�����飬�����������е�����Ե�������
 * @author 14257
 *
 */
public class ReversePairs {
	public static void main(String[] args) {

		int[] nums= {7,5,6,4};
        int len = nums.length;

        if (len < 2) {
        	System.out.println(0);
            return ;
        }

        int[] copy = new int[len];
        for (int i = 0; i < len; i++) {
            copy[i] = nums[i];
        }

        int[] temp = new int[len];
        System.out.println(reversePairs(copy, 0, len - 1, temp));
        
    }

    /**
     * nums[left..right] ��������Ը�����������
     *
     * @param nums
     * @param left
     * @param right
     * @param temp
     * @return
     */
    private static int reversePairs(int[] nums, int left, int right, int[] temp) {
        if (left == right) {
            return 0;
        }
        int mid = left + (right - left) / 2;
        int leftPairs = reversePairs(nums, left, mid, temp);
        int rightPairs = reversePairs(nums, mid + 1, right, temp);

        if (nums[mid] <= nums[mid + 1]) {
            return leftPairs + rightPairs;
        }

        int crossPairs = mergeAndCount(nums, left, mid, right, temp);
        return leftPairs + rightPairs + crossPairs;
    }

    /**
     * nums[left..mid] ����nums[mid + 1..right] ����
     *
     * @param nums
     * @param left
     * @param mid
     * @param right
     * @param temp
     * @return
     */
    private static int mergeAndCount(int[] nums, int left, int mid, int right, int[] temp) {
        for (int i = left; i <= right; i++) {
            temp[i] = nums[i];
        }

        int i = left;
        int j = mid + 1;

        int count = 0;
        for (int k = left; k <= right; k++) {

            if (i == mid + 1) {
                nums[k] = temp[j];
                j++;
            } else if (j == right + 1) {
                nums[k] = temp[i];
                i++;
            } else if (temp[i] <= temp[j]) {
                nums[k] = temp[i];
                i++;
            } else {
                nums[k] = temp[j];
                j++;
                count += (mid - i + 1);
            }
        }
        return count;
    }


		
		
//		
//		int count=0;
//		for (int i = 0; i < nums.length; i++) {
//			count+=sum(nums,i, nums[i]);
//		}
//		System.out.println(count);
//	}
//
//	private static int sum(int[] nums, int i, int j) {
//		int s=0;
//		for (int j2 = 0; j2 < i; j2++) {
//			if (nums[j2]>j) {
//				s++;
//			}
//		}
//		return s;
//	}
}
