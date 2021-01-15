package leetCode;

import java.util.Arrays;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。
 * @author 14257
 *
 */
public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		Arrays.sort(strs,(o1,o2)->o1.length()-o2.length());
		String s =strs[0] ;
		
		if(strs.length==0) System.out.println("");
		for (int i = 1; i < strs.length; i++) {
			for (int j = 0; j < strs[i-1].length(); j++) {
				if (s.charAt(j)!=strs[i].charAt(j)) {
					s=s.substring(0, j);
					break;
				}
			}
		}
		System.out.println(s);
//		int l = strs[0].length();
//		for (int i = 0; i < l; i++) {
//			char c = strs[0].charAt(i);
//			boolean b=true;
//			for (int j = 1; j < strs.length; j++) {
//				if (strs[j].charAt(i)!=c) {
//					b=false;
//					break;
//				}
//			}
//			if (b) {
//				s+=c;
//			}else {
//				break;
//			}
//		}
//		System.out.println(s);
	}
}
