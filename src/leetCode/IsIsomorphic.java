package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己
 *  * @author 14257
 *
 */
public class IsIsomorphic {
	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		Map<Character, Character> map = new HashMap<>();
		Map<Character, Character> zmap = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			char value=t.charAt(i);
			if (!map.containsKey(key)) {
				map.put(key, value);
			}
			if (!zmap.containsKey(value)) {
				zmap.put(value, key);
			}
			if (map.get(key)!=value||zmap.get(value)!=key) {
//				return false;
			}
			
		}
		System.out.println(true);
	}
}
