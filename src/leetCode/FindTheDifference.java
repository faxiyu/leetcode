package leetCode;

import java.util.Arrays;

/**
 * 给定两个字符串 s 和 t，它们只包含小写字母。
字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
请找出在 t 中被添加的字母。
 * @author 14257
 *
 */
public class FindTheDifference {
	public static void main(String[] args) {
		String s = "";
		String t = "y";
		if (s.length()==0) {
//			return t.charAt(0);
		}
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		String valueOf = String.valueOf(charArray);
		char[] charArray2 = t.toCharArray();
		Arrays.sort(charArray2);
		String valueOf2 = String.valueOf(charArray2);
		char c=' ';
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i]!=charArray2[i]) {
				c=charArray2[i];
				break;
			}else if (i==charArray.length-1) {
				c=charArray2[i+1];
				break;
			}
		}
		System.out.println(c);
	}
}
