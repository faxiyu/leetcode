package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。
 * 例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 * @author 14257
 *
 */
public class CommonChars {
	public static void main(String[] args) {
		String[] A= {"bella","label","roller"};
		List< String> s = new ArrayList<>();
		int[] count = new int[26];
		for (int i = 0; i < A[0].length(); i++) {
			count[A[0].charAt(i)-'a']++;
		}
		for (int i = 1; i < A.length; i++) {
			int icount[] = new int[26];
			for (int j = 0; j < A[i].length(); j++) {
				icount[A[i].charAt(j)-'a']++;
			}
			for (int j = 0; j < icount.length; j++) {
				count[j]=Math.min(count[j], icount[j]);
			}
		}
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i]; j++) {
				s.add(String.valueOf((char)('a'+i)));				
			}
		}
		
	}
}
