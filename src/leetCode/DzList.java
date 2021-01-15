package leetCode;

/**
 * 给定一个整型数组, 你的任务是找到所有该数组的递增子序列，递增子序列的长度至少是2。
 * 输入: [4, 6, 7, 7]
 * 输出: [[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7], [4,7,7]]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DzList {
	
	static List<Integer> temp = new ArrayList<Integer>();
	static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public static void main(String[] args) {
    	int[] nums={4,6,7,7};
    	dfs(0, Integer.MIN_VALUE, nums);
    	System.out.println(ans);
		
	} 


    public static void dfs(int cur, int last, int[] nums) {
    	 if (cur == nums.length) {
             if (temp.size() >= 2) {
                 ans.add(new ArrayList<Integer>(temp));
             }
             return;
         }
         if (nums[cur] >= last) {
             temp.add(nums[cur]);
             dfs(cur + 1, nums[cur], nums);
             temp.remove(temp.size() - 1);
         }
         if (nums[cur] != last) {
             dfs(cur + 1, last, nums);
         }
    }
	
	
//	public static void main(String[] args) {	
//		int[] nums={4,6,7,7};
//		List<List<Integer>> list = new ArrayList<>();
//		Arrays.sort(nums);
//		for (int i = 0; i < nums.length-1; i++) {
//			for (int j = i+1; j < nums.length; j++) {
//				if (j>i+1&&nums[j]==nums[j-1]) {
//					continue;
//				}
//				if (i>0&&nums[i]==nums[i-1]) {
//					break;
//				}
//				List<Integer> l= new ArrayList<>();
//				l.add(nums[i]);
//				l.add(nums[j]);
//				list.add(l);
//			}
//		}
//		System.out.println(list);
//		int n=1;
//		int m=list.size();
//		int count=m;
//		while(true) {
//			boolean v=false;
//			for (int i = 0; i <count-1 ; i++) {
//				for (int j = n; j < m; j++) {
//					if (j<=i) {
//						continue;
//					}
//					int size = list.get(i).size();
//					if (list.get(i).get(size-1)==list.get(j).get(0)) {
//						v=true;
//						List<Integer> ll = new ArrayList<>();
//						for (int k = 0; k < size; k++) {
//							ll.add(list.get(i).get(k));
//						}
//						for (int k = 1; k < list.get(j).size(); k++) {
//							ll.add(list.get(j).get(k));
//						}
//						list.add(ll);
//					}
//				}
//			}
//			if (!v) {
//				break;
//			}
//			n=m;
//			m=list.size();
//		}
//		System.out.println(list);
//	}
}
