package leetCode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/**
 * 给定长度分别为 m 和 n 的两个数组，其元素由 0-9 构成，表示两个自然数各位上的数字。
 * 现在从这两个数组中选出 k (k <= m + n) 个数字拼接成一个新的数，
 * 要求从同一个数组中取出的数字保持其在原数组中的相对顺序。
 * 求满足该条件的最大数。结果返回一个表示该最大数的长度为 k 的数组。
 * 说明: 请尽可能地优化你算法的时间和空间复杂度。
 * @author 14257
 *
 */
public class MaxNumber {
	public static void main(String[] args) {
		int[] nums1= {6,7};
		int[] nums2= {6,0,4};
		int k=5;

		int[] max= new int[k];
		for (int i =0 ; i <= k; i++) {
			if (i<=nums1.length&&k-i<=nums2.length) {
				int[] a=maxnum(nums1,i);			
				int[] b=maxnum(nums2,k-i);
				int[] sum=hebing(a,b);
				max = maxn(max,sum);				
//				System.out.println(Arrays.toString(a)+"  "+Arrays.toString(b)+"  "+Arrays.toString(sum)+"  "+Arrays.toString(max));
			}
			
		}
//		return max;
//		System.out.println(Arrays.toString(max));
	}

	private static int[] maxn(int[] max, int[] sum) {
		for (int i = 0; i < sum.length; i++) {
			if (max[i]>sum[i]) {
				return max;
			}else if (max[i]<sum[i]) {
				return sum;
			}
		}
		return sum;
	}

	private static int[] maxnum(int[] nums, int i) {
		if (i==0) {
			return new int[] {};
		}
		int d = nums.length-i;
		Stack<Integer> stack = new Stack<>();
		for (int j = 0; j < nums.length; j++) {
			while(stack.size()!=0&&d>0&&stack.peek()<nums[j]) {
				stack.pop();
				d--;
			}
			stack.add(nums[j]);
		}
		int[] a = new int [i];
		int b=0;
//		System.out.println(stack.toString());
		for (Integer integer : stack) {
			a[b]=integer;
			b++;
			if (b>i-1) break;
		}
		return a;	
	}
	
	public static int[] hebing(int[] subsequence1, int[] subsequence2) {
        int x = subsequence1.length, y = subsequence2.length;
        if (x == 0) {
            return subsequence2;
        }
        if (y == 0) {
            return subsequence1;
        }
        int mergeLength = x + y;
        int[] merged = new int[mergeLength];
        int index1 = 0, index2 = 0;
        for (int i = 0; i < mergeLength; i++) {
            if (compare(subsequence1, index1, subsequence2, index2) > 0) {
                merged[i] = subsequence1[index1++];
            } else {
                merged[i] = subsequence2[index2++];
            }
        }
        return merged;
    }

    public static int compare(int[] subsequence1, int index1, int[] subsequence2, int index2) {
        int x = subsequence1.length, y = subsequence2.length;
        while (index1 < x && index2 < y) {
            int difference = subsequence1[index1] - subsequence2[index2];
            if (difference != 0) {
                return difference;
            }
            index1++;
            index2++;
        }
        return (x - index1) - (y - index2);
    }

}
