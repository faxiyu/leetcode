package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * ������һ����ƽ���ϵĵ���ɵ��б� points����Ҫ�����ҳ� K ������ԭ�� (0, 0) ����ĵ㡣
 * �����ƽ��������֮��ľ�����ŷ����¾��롣��
 * ����԰��κ�˳�򷵻ش𰸡����˵������˳��֮�⣬��ȷ����Ψһ�ġ�
 * 
 * @author 14257
 *
 */
public class KClosest {
	public static void main(String[] args) {
		int[][] points = {{3,3},{5,-1},{-2,4}};
		int k =2;
//		Map<Integer, List<Integer>> map = new TreeMap<>();
//		for (int i = 0; i < points.length; i++) {
//			int key=points[i][0]*points[i][0]+points[i][1]*points[i][1];
//			List<Integer> list;
//			if (map.get(key)==null) {
//				list = new ArrayList<>();
//			}else {
//				 list = map.get(key);				
//			}
//			list.add(i);
//			map.put(key, list);
//		}
//		int[][] end = new int[k][2];
//		int j=0;
//		Collection<List<Integer>> values = map.values();
//		for (List<Integer> list : values) {
//			for (Integer i : list) {
//				if (j<k) {
//					end[j] = points[i];
//					j++;					
//				}else {
//					break;
//				}
//			}			
//		}
//		
//		System.out.println(Arrays.toString(end[0])+" "+Arrays.toString(end[1]));
		
		Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] point1, int[] point2) {
                return (point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]);
            }
        });
		Arrays.copyOfRange(points, 0,k);
	}
}
