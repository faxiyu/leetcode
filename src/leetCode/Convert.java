package leetCode;

import java.util.Arrays;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"
 * @author 14257
 *
 */
public class Convert {
	public static void main(String[] args) {
		String s = "ABC";
		int numRows = 1;
		if (numRows<2) {
			System.out.println(s);
		}
		boolean b=true;
		int a=0;
		String[] sb = new String[numRows];
		for (int i = 0; i < s.length(); i++) {
			if (a==0) {
				b=true;
			}
			if (a==numRows-1) {
				b=false;
			}
			sb[a]+=s.charAt(i);
			if (b) {
				a++;
			}else {
				a--;
			}
		}
		String ss = "";
		for (String string : sb) {
			if (string==null) {
				break;
			}
			ss+=string.substring(4);
		}
		System.out.println(ss);
	}
}
