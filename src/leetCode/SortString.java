package leetCode;

import java.util.Arrays;

/**
 * 给你一个字符串 s ，请你根据下面的算法重新构造字符串：
从 s 中选出 最小 的字符，将它 接在 结果字符串的后面。
从 s 剩余字符中选出 最小 的字符，且该字符比上一个添加的字符大，将它 接在 结果字符串后面。
重复步骤 2 ，直到你没法从 s 中选择字符。
从 s 中选出 最大 的字符，将它 接在 结果字符串的后面。
从 s 剩余字符中选出 最大 的字符，且该字符比上一个添加的字符小，将它 接在 结果字符串后面。
重复步骤 5 ，直到你没法从 s 中选择字符。
重复步骤 1 到 6 ，直到 s 中所有字符都已经被选过。
在任何一步中，如果最小或者最大字符不止一个 ，你可以选择其中任意一个，并将其添加到结果字符串。

请你返回将 s 中字符重新排序后的 结果字符串 
 * @author 14257
 *
 */
public class SortString {
	public static void main(String[] args) {
		String s = "leetcode";
		
		
		int[] zm = new int[26];
		for (int i = 0; i < s.length(); i++) {
			zm[s.charAt(i)-'a']++;
		}
		System.out.println(Arrays.toString(zm));
		int count = s.length();
		String a ="";
		while(count>0) {
			for (int i = 0; i < zm.length; i++) {
				if (zm[i]>0) {
					zm[i]--;
					a=a+(char)('a'+i);
					count--;
				}
			}
			for (int i = zm.length-1; i >=0; i--) {
				if (zm[i]>0) {
					zm[i]--;
					a=a+(char)('a'+i);
					count--;
				}
			}
		}
		System.out.println(a);
	}
}
