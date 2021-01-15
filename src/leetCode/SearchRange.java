package leetCode;

import java.util.Arrays;
import java.util.List;

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * @author 14257
 *
 */
public class SearchRange {
	public static void main(String[] args) {
		
		int[] nums = {1,2,3};
		int target = 1;
	
		int len = nums.length;
		int min = 0;
		int max=len-1;
		for(;min<max;) {
			int mid = (min+max)/2;
			if (nums[mid]<target) {
				min=mid+1;
			}else if (nums[mid] ==target ) {
				max=mid;
			}else {
				max=mid-1;
			}
		}
		if (nums[min]!=target) {
			System.out.println(-1+"  "+-1);
		}
		int start = min;
		int end = len-1;
		for (int i = start; i < nums.length; i++) {
			if (nums[i]!=target) {
				end=i-1;
				
			}
		}
		System.out.println(start+" "+end);
		
		
		
		
		
//        if (len == 0) {
//        	System.out.println(-1+" "+-1);
//            return ;
//        }
//
//        int firstPosition = findFirstPosition(nums, target);
//        if (firstPosition == -1) {
//        	System.out.println(-1+" "+-1);
//            return ;
//        }
//
//        int lastPosition = findLastPosition(nums, target);
//        System.out.println(firstPosition+" "+lastPosition);
//	}
//	 private static int findFirstPosition(int[] nums, int target) {
//	        int left = 0;
//	        int right = nums.length - 1;
//	        while (left < right) {
//	        	 int mid = left + (right - left) / 2;
//	             // 小于一定不是解
//	             if (nums[mid] < target) {
//	                 // 下一轮搜索区间是 [mid + 1, right]
//	                 left = mid + 1;
//	             } else if (nums[mid] == target) {
//	                 // 下一轮搜索区间是 [left, mid]
//	                 right = mid;
//	             } else {
//	                 // nums[mid] > target，下一轮搜索区间是 [left, mid - 1]
//	                 right = mid - 1;
//	             }
//	        }
//	        if (nums[left] == target) {
//	            return left;
//	        }
//	        return -1;
//	 }
//	 
//	private static int findLastPosition(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//        while (left < right) {
//        	int mid = left + (right - left + 1) / 2;
//            if (nums[mid] > target) {
//                // 下一轮搜索区间是 [left, mid - 1]
//                right = mid - 1;
//            } else if (nums[mid] == target){
//                // 下一轮搜索区间是 [mid, right]
//                left = mid;
//            } else {
//                // nums[mid] < target，下一轮搜索区间是 [mid + 1, right]
//                left = mid + 1;
//            }
//        }
//        return left;
    }
}
