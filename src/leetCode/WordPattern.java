package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * ����һ�ֹ��� pattern ��һ���ַ��� str ���ж� str �Ƿ���ѭ��ͬ�Ĺ��ɡ�
����� ��ѭ ָ��ȫƥ�䣬���磬 pattern ���ÿ����ĸ���ַ��� str �е�ÿ���ǿյ���֮�������˫�����ӵĶ�Ӧ���ɡ�
 * @author 14257
 *
 */
public class WordPattern {
	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog cat cat fish";
		Map<String,Character> map = new HashMap<>();
		Set<Character> set = new HashSet<>();
		String[] split = s.split(" ");
		if (split.length!=pattern.length()) {
			System.out.println(false);
			return ;
		}
		int i=0;
		for (String string : split) {
			Character orDefault = map.getOrDefault(string, null);
			if (orDefault==null) {
				if (set.contains(pattern.charAt(i))) {
					System.out.println(false);
					return ;
				}else {
					set.add(pattern.charAt(i));
				}
				map.put(string, pattern.charAt(i));
				i++;
			}else if (orDefault==pattern.charAt(i)) {
				i++;
			}else {
				System.out.println(false);
				return ;
			}
		}
		System.out.println(true);
	}
}
