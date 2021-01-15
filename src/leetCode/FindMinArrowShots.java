package leetCode;

import java.util.Arrays;

/**
 * �ڶ�ά�ռ�����������ε����򡣶���ÿ�������ṩ��������ˮƽ�����ϣ�����ֱ���Ŀ�ʼ�ͽ������ꡣ
 * ��������ˮƽ�ģ����������겢����Ҫ�����ֻҪ֪����ʼ�ͽ����ĺ�������㹻�ˡ���ʼ��������С�ڽ������ꡣ
 * һ֧������������ x ��Ӳ�ͬ����ȫ��ֱ�������
 * ������ x �����һ֧��������һ�������ֱ���Ŀ�ʼ�ͽ�������Ϊ xstart��xend�� 
 * ������  xstart �� x �� xend���������ᱻ��������������Ĺ���������û�����ơ� ����һ�������֮�󣬿������޵�ǰ����
 * �������ҵ�ʹ����������ȫ��������������Ĺ�������С������
 * ����һ������ points ������ points [i] = [xstart,xend] �������������������������������С��������
 * @author 14257
 *
 */
public class FindMinArrowShots {
	public static void main(String[] args) {
		int[][] points = {{9,12},{1,10},{4,11},{8,12},{3,9},{6,9},{6,7}};
		Arrays.sort(points,(o1,o2)->{
			if (o1[0]>o2[0]) {
				return 1;
			}else if(o1[0]<o2[0]){
				return -1;
			}else {
				if (o1[1]>=o2[1]) {
					return 1;
				}else {
					return -1;
				}
			}
					});
		int count=1;
		int max = points[0][1];
		for (int[] is : points) {
			if (is[0]>max) {
				count++;
				max=is[1];
			}else {
				if (is[1]<max) {
					max=is[1];
				}
			}
		}
		
		System.out.println(count);
		
//		
//		Arrays.sort(points, new Comparator<int[]>() {
//			public int compare(int[] point1, int[] point2) {
//				if (point1[1] > point2[1]) {
//					return 1;
//				} else if (point1[1] < point2[1]) {
//					return -1;
//				} else {
//					return 0;
//				}
//			}
//		});
//		int pos = points[0][1];
//		int ans = 1;
//		for (int[] balloon : points) {
//			if (balloon[0] > pos) {
//				pos = balloon[1];
//				++ans;
//			}
//		}
//		System.out.println(ans);

	}

}
