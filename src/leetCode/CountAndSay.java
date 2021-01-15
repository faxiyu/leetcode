package leetCode;
/**
 * 给定一个正整数 n ，输出外观数列的第 n 项。
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 * 你可以将其视作是由递归公式定义的数字字符串序列：
 * countAndSay(1) = "1"
 * countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
 * @author 14257
 *
 */
public class CountAndSay {
	public static void main(String[] args) {
		int n=5;
		String s = "1";
		String ss = "";
		for (int i = 0; i < n-1; i++) {
			int count = 0;
			char c=s.charAt(0);
			for (int j = 0; j < s.length(); j++) {
				if (j!=0&&s.charAt(j)!=s.charAt(j-1)) {
					ss+=count+String.valueOf(c);
					count=0;
					c=s.charAt(j);
				}
				count++;
			}
			ss+=count+String.valueOf(c);
			s=ss;
			System.out.println(s);
			ss="";
		}
		System.out.println(s);
	}
}
