package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ����һ���ַ������飬����ĸ��λ�������һ����ĸ��λ��ָ��ĸ��ͬ�������в�ͬ���ַ�����
 * @author 14257
 *
 */
public class GroupAnagrams {
	public static void main(String[] args) {
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
//		List<List<String>> lists = new ArrayList<>();
		Map<String, List<String>> map  = new HashMap<>();
		for (String str:strs) {
			char[] charArray2 = str.toCharArray();
			Arrays.sort(charArray2);
			String valueOf = String.valueOf(charArray2);
			List<String> orDefault = map.getOrDefault(valueOf, new ArrayList<>());
			orDefault.add(str);
			map.put(valueOf, orDefault);
		}
		List<List<String>> lists = new ArrayList<>(map.values());
//		return lists;
	}
}
