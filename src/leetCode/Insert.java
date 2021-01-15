package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给出一个无重叠的 ，按照区间起始端点排序的区间列表。
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）
 * @author 14257
 *
 */
public class Insert {
	public static void main(String[] args) {
		int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
		int[] newInterva= {4,17};
		if (intervals.length<1) {
			return ;
		}
		List<int[]> list = new ArrayList<>();
		int j=0;
		int min = 0;
		int max=0;
		for (int i = 0; i < intervals.length; i++) {
			if (j<=1&&newInterva[j]>=intervals[i][0]&&newInterva[j]<=intervals[i][1]) {
				if (j==1) {
					max=intervals[i][1];
					int[] a= {min,max};
					list.add( a);
				}else {
					min=intervals[i][0];
					i--;
				}
				j++;
				
			}else if (j<=1&&newInterva[j]<intervals[i][0]) {
				if (j==0) {
					min=newInterva[j];
					i--;					
				}else {
					max=newInterva[j];
					int[] a = {min,max};
					list.add(a);
				}
				j++;
			}else if (j<=1&&i==intervals.length-1) {
				if (j==0) {
					list.add(intervals[i]);
					list.add(newInterva);
				}
				if (j==1) {
					max=newInterva[j];
					int[] a = {min,max};
					list.add(a);
				}
			}
			else if(j!=1) {
				list.add(intervals[i]);
			}
		}
		int[][] a=new int[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			a[i]=list.get(i);
		}
		System.out.println(Arrays.toString(a));
	}
}
