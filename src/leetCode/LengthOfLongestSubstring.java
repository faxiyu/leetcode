package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3 
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * @author 14257
 *
 */

public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		String s = "a";
		if (s.length()<=1) {
			System.out.println(s.length());
			
		}
		List<Character> list = new ArrayList<>();
		int max=0;
		list.add(s.charAt(0));
		for (int i = 1; i < s.length(); i++) {
			boolean b=false;
			int j=0;
			for (; j < list.size(); j++) {
				if (list.get(j)==s.charAt(i)) {
					b=true;
					break;
				}
			}
			if(b) {
				for (int j2 = 0; j2 <= j; j2++) {
					list.remove(0);
				}
			}
			list.add(s.charAt(i));
			if (max<list.size()) {
				max=list.size();
			}
		}
		System.out.println(max);
	}
}
