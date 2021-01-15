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
 * 我们有一个由平面上的点组成的列表 points。需要从中找出 K 个距离原点 (0, 0) 最近的点。
 * （这里，平面上两点之间的距离是欧几里德距离。）
 * 你可以按任何顺序返回答案。除了点坐标的顺序之外，答案确保是唯一的。
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
