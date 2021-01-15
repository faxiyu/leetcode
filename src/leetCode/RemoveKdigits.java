package leetCode;

import java.util.Arrays;
import java.util.Stack;

/**
 * 给定一个以字符串表示的非负整数 num，移除这个数中的 k 位数字，使得剩下的数字最小
 * @author 14257
 *
 */
public class RemoveKdigits {
	public static void main(String[] args) {
		String num = "1234";
		int k=2;
		Stack<Character> st  = new Stack<>();
		for (int i = 0; i < num.length(); i++) {
			System.out.println("k "+k+" st  "+st.toString());
			while (k>0&&st.size()>0&&num.charAt(i)<st.peek()) {
				k--;
				st.pop();

			}
			st.push(num.charAt(i));
			if (st.size()==num.length()-k) {
				break;
			}
		}
		String string2 = Arrays.toString(st.toArray());
		String string = st.toString();
		System.out.println(string2);
		
		
//		StringBuffer sb = new StringBuffer(num);
//		int a=0;
//		if (k==num.length()) {
//			System.out.println(0);
//			return ;
//		}
//		for (int i = 0; i <sb.length()-1; i++) {
//			if (Integer.valueOf(sb.charAt(i))>Integer.valueOf(sb.charAt(i+1))) {
//				sb.deleteCharAt(i);
//				i=-1;
//				a++;
//			}
//			while (sb.length()>1&&sb.charAt(0)=='0') {
//				sb.deleteCharAt(0);
//			}
//			if (a==k) {
//				System.out.println(sb.toString());
//				return ;
//			}
//		}
//		System.out.println(sb.toString().substring(0,num.length()-k ));
	}
}
