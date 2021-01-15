package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 给定一种规律 pattern 和一个字符串 str ，判断 str 是否遵循相同的规律。
这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
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
