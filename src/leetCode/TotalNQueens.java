package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TotalNQueens {
	/**
	 * n �ʺ������о�������ν� n ���ʺ������ n��n �������ϣ�����ʹ�ʺ�˴�֮�䲻���໥������ ��������б��
	 * 
	 * @param args
	 */
	static int sum = 0;

	public static void main(String[] args) {
		int n = 5;
		Map<Integer, Integer> map = new HashMap<>();
		Map<Integer, Integer> map1 = new HashMap<>();
		gj(n, 0, map,map1);
		System.out.println(sum);

	}

	private static void gj(int n, int k, Map<Integer, Integer> map, Map<Integer, Integer> map1) {
		if (k >= n) {
			if (map.size() == n) {
				sum++;
				System.out.println(map.toString());
			}
			return;
		}
		for (int i = 0; i < n; i++) {
			if (map.containsKey(i) || map.containsValue(k + i)||map1.containsValue(k - i)) {
				continue;
			} else {
				map.put(i, k + i);
				map1.put(i, k - i);		
				gj(n, k + 1, map,map1);
				map.remove(i);
				map1.remove(i);
			}
		}
	}

}
