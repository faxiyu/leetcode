package leetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * ����һ���ַ��� s ��
 * ����ȥ���ַ������ظ�����ĸ��ʹ��ÿ����ĸֻ����һ�Ρ�
 * �豣֤ ���ؽ�����ֵ�����С��Ҫ���ܴ��������ַ������λ�ã���
 * @author 14257
 *
 */
public class RemoveDuplicateLetters {
	public static void main(String[] args) {
		String s = "bcabc";
		int[] a = new int[26];
		for (char c : s.toCharArray()) {
			a[c-'a']++;
		}
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (!stack.contains(c)) {
				while(stack.size()>0&&stack.peek()>c&&a[stack.peek()-'a']>1) {
					a[stack.pop()-'a']--;
				}
				stack.add(c);
			}else {
				a[c-'a']--;				
			}
		}
		StringBuilder sb = new StringBuilder();
		for(Character c : stack) {
			sb.append(c);
		}
		
		System.out.println(sb.toString());
	}
}
