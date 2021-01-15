package leetCode;

import java.util.Arrays;

/**
 * ����һ������ļ��ϣ��ҵ���Ҫ�Ƴ��������С������ʹʣ�����以���ص���
 * @author 14257
 *
 */
public class EraseOverlapIntervals {
	public static void main(String[] args) {
		int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
		Arrays.sort(intervals,(o1,o2)->{
			if (o1[0]==o2[0]) {
				return o1[1]-o2[1];
			}
			return o1[0]-o2[0];});
		int start=intervals[0][0];
		int end = intervals[0][1];
		int count=0;
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0]==start) {
				count++;
			}else if (intervals[i][0]<end) {
				count++;
				end=Math.min(intervals[i][1], end);
			}else {
				start=intervals[i][0];
				end=intervals[i][1];
			}
		}
		System.out.println(count);
	}
}
