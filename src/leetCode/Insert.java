package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����һ�����ص��� ������������ʼ�˵�����������б�
 * ���б��в���һ���µ����䣬����Ҫȷ���б��е�������Ȼ�����Ҳ��ص�������б�Ҫ�Ļ������Ժϲ����䣩
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
