package leetCode;
/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * @author 14257
 *
 */
public class FirstUniqChar1 {
	public static void main(String[] args) {
		String s = "leetcode";
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				System.out.println(i);
				return ;
			}
		}
		System.out.println(s.length()-1);
	}
}
