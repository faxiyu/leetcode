package leetCode;

import java.util.Arrays;

/**
 * ���������ַ��� s �� t ����дһ���������ж� t �Ƿ��� s ����ĸ��λ�ʡ�
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
