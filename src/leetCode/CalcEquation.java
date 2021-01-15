package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ����һ������������ equations ��һ��ʵ��ֵ���� values ��Ϊ��֪������
 * ���� equations[i] = [Ai, Bi] �� values[i] ��ͬ��ʾ��ʽ Ai / Bi = values[i] ��
 * ÿ�� Ai �� Bi ��һ����ʾ�����������ַ�����
 * ����һЩ������ queries ��ʾ�����⣬���� queries[j] = [Cj, Dj] ��ʾ�� j �����⣬���������֪�����ҳ� Cj / Dj = ? �Ľ����Ϊ�𰸡�
 * @author 14257
 *
 */
public class CalcEquation {
	public static void main(String[] args) {
		List<List<String>> equations = new ArrayList<>();
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		equations.add(list);
		List<String> list2 = new ArrayList<>();
		list2.add("b");
		list2.add("c");
		equations.add(list2);
		double[] values = {2.0,3.0};
		List<List<String>> queries = new ArrayList<>();
		List<String> list3 = new ArrayList<>();
		list3.add("a");
		list3.add("c");
		queries.add(list3);
		List<String> list4 = new ArrayList<>();
		list4.add("a");
		list4.add("e");
		queries.add(list4);
		double[] d = new double[queries.size()];
		Map<String, Double> map=new HashMap<>();
		System.out.println(equations.get(0));
		for(int i=0;i<equations.size();i++) {
			List<String> l = equations.get(i);
			String s0 = l.get(0);
			String s1 = l.get(1);
			if (!map.containsKey(s0)&&!map.containsKey(s1)) {
				map.put(s1, 1.0);
				map.put(s0, 1.0*values[i]);
			}else if (map.containsKey(s0)&&!map.containsKey(s1)) {
				map.put(s1, map.get(s0)/values[i]);
			}else if (map.containsKey(s1)&&!map.containsKey(s0)) {
				map.put(s0, map.get(s1)*values[i]);
			}
		}
		for (int i = 0; i < d.length; i++) {
			List<String> l = queries.get(i);
			String s0 = l.get(0);
			String s1 = l.get(1);
			if (!map.containsKey(s0)||!map.containsKey(s1)) {
				d[i] = -1.000f;
			}else {
				d[i]=map.get(s0)/map.get(s1);
			}
		}
		System.out.println(Arrays.toString(d));
	}
}
