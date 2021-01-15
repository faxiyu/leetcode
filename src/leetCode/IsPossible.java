package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * ����һ��������������������� num�����ܰ����ظ����֣���
 * ���㽫���Ƿָ��һ�����������У�����ÿ�������ж���������������ҳ�������Ϊ 3 ��
 * @author 14257
 *
 */
public class IsPossible {
	public static void main(String[] args) {
		int[] nums = {1,2,3,3,4,5,5};
		if (nums.length<3) {
			System.out.println(false);
		}
		int max=0;
		//��¼���ִ���
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			map.put(i,map.getOrDefault(i,0)+1);
			if (max<map.get(i)) {
				max=map.get(i);
			}
		}
		
		if (nums.length<max*3) {
			System.out.println(false);
		}
		//��¼ÿ�����н�β
		Map<Integer, Integer> tail = new HashMap<>();
		for (int i : nums) {
			int count = map.get(i);
			if (count>0) {
				if (tail.getOrDefault(i-1, 0)>0) {
					tail.put(i-1, tail.get(i-1)-1);
					tail.put(i, tail.getOrDefault(i,0)+1);
					map.put(i,map.get(i)-1);
					System.out.println(map.toString());
					System.out.println(tail.toString());
					System.out.println("==========");
				}else {
					if (map.getOrDefault(i+1,0)>0&&map.getOrDefault(i+2,0)>0) {
						tail.put(i+2, tail.getOrDefault(i+2,0)+1);
						map.put(i, map.get(i)-1);
						map.put(i+1, map.get(i+1)-1);
						map.put(i+2, map.get(i+2)-1);
						System.out.println(map.toString());
						System.out.println(tail.toString());
						System.out.println("==========");
					}else {
						System.out.println(false);
					}
				}
			}
		}
		System.out.println(true);
		
		System.out.println(max);
	}
}
