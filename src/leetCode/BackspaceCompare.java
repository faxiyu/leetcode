package leetCode;
/**
 * 
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 * @author 14257
 *
 */
public class BackspaceCompare {
	public static void main(String[] args) {
		String s = "a##c";
		String t = "#a#c";
		String s1 =  z(s);
		String t1 = z(t);
		System.out.println(s1+" "+t1 );
		System.out.println(s1.equals(t1));
	}

	private static String z(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='#') {
				if (sb.length()==0) {
					continue;
				}
				sb.deleteCharAt(sb.length()-1);
			}else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
}
