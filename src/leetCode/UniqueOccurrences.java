package leetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 * @author 14257
 *
 */
public class UniqueOccurrences {
	public static void main(String[] args) {
		int[] arr = {26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16};
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		Collection<Integer> values = map.values();
		boolean b = true;
		List<Integer> list =new ArrayList<Integer>(values);
		for (int i = 0; i < list.size(); i++) {
			if (list.subList(i+1, list.size()).indexOf(list.get(i))!=-1) {
				b=false;
				break;
			}
		}
		System.out.println(b);
		System.out.println(map.toString());
	}
}
