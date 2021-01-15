package leetCode;

import java.util.Arrays;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * @author 14257
 *
 */
public class IsAnagram {
	public static void main(String[] args) {
		String s = "a";
		String t = "b";
		char[] chars = s.toCharArray();
		char[] chart = t.toCharArray();
		Arrays.sort(chars);
		Arrays.sort(chart);
		System.out.println(Arrays.toString(chars));
		System.out.println(Arrays.toString(chars));
		if (Arrays.toString(chars).equals(Arrays.toString(chars))) {
			System.out.println(true);
		}
		
//		if(s.length() != t.length())
//            return false;
//        int[] alpha = new int[26];
//        for(int i = 0; i< s.length(); i++) {
//            alpha[s.charAt(i) - 'a'] ++;
//            alpha[t.charAt(i) - 'a'] --;
//        }
//        for(int i=0;i<26;i++)
//            if(alpha[i] != 0)
//                return false;
//        return true;
//    }
	}
}
