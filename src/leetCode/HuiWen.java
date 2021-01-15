package leetCode;
/**
 * 给定一个字符串 s，你可以通过在字符串前面添加字符将其转换为回文串。找到并返回可以用这种方式转换的最短回文串。
 * 示例 1:
 * 输入: "aacecaaa"
 * 输出: "aaacecaaa"
 * @author 14257
 *
 */
public class HuiWen {
	public static void main(String[] args) {
		String s = "caac";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String b= null;
		for (int i = 0; i < s.length(); i++) {
			if (sb.substring(i).equals(s.substring(0, s.length()-i))) {
				b = sb.toString()+s.substring(s.length()-i);
				break;
			}
		}
		System.out.println(b);
		
	}
}