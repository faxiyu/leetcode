package leetCode;
/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * @author 14257
 *
 */
public class ReplaceSpace {

	public static void main(String[] args) {
		String s = "We are happy.";
		StringBuffer sb = new StringBuffer(s);
		for (;;) {
			int index = sb.indexOf(" ");
			if (index==-1) {
				break;
			}
			sb.replace(index, index+1, "%20");
			
		}
		System.out.println(sb.toString());

	}

}
