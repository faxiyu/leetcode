package leetCode;
/**
 * 给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。
 * （当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）
 * @author 14257
 *
 */
public class MonotoneIncreasingDigits {
	public static void main(String[] args) {
		int N=120;
		String string = Integer.toString(N);
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			boolean b=true;
			for (int j = i+1; j < string.length(); j++) {
				if (c>string.charAt(j)) {
					b=false;
					break;
				}else if (c==string.charAt(j)) {
					continue;
				}else {
					break;
				}
			}
			if (b) {
				s.append(c);
			}else {
				Integer valueOf = Integer.valueOf(c)-48;
				s.append(valueOf-1);
				break;
			}
		}
		while (string.length()-s.length()>0) {
			s.append(9);
		}
//		return (int)Integer.valueOf(s);
		System.out.println(Integer.valueOf(s.toString()));
	}
}
