package leetCode;

import java.util.Arrays;

/**
 * ����һ���ַ��� s ���������������㷨���¹����ַ�����
�� s ��ѡ�� ��С ���ַ������� ���� ����ַ����ĺ��档
�� s ʣ���ַ���ѡ�� ��С ���ַ����Ҹ��ַ�����һ����ӵ��ַ��󣬽��� ���� ����ַ������档
�ظ����� 2 ��ֱ����û���� s ��ѡ���ַ���
�� s ��ѡ�� ��� ���ַ������� ���� ����ַ����ĺ��档
�� s ʣ���ַ���ѡ�� ��� ���ַ����Ҹ��ַ�����һ����ӵ��ַ�С������ ���� ����ַ������档
�ظ����� 5 ��ֱ����û���� s ��ѡ���ַ���
�ظ����� 1 �� 6 ��ֱ�� s �������ַ����Ѿ���ѡ����
���κ�һ���У������С��������ַ���ֹһ�� �������ѡ����������һ������������ӵ�����ַ�����

���㷵�ؽ� s ���ַ����������� ����ַ��� 
 * @author 14257
 *
 */
public class SortString {
	public static void main(String[] args) {
		String s = "leetcode";
		
		
		int[] zm = new int[26];
		for (int i = 0; i < s.length(); i++) {
			zm[s.charAt(i)-'a']++;
		}
		System.out.println(Arrays.toString(zm));
		int count = s.length();
		String a ="";
		while(count>0) {
			for (int i = 0; i < zm.length; i++) {
				if (zm[i]>0) {
					zm[i]--;
					a=a+(char)('a'+i);
					count--;
				}
			}
			for (int i = zm.length-1; i >=0; i--) {
				if (zm[i]>0) {
					zm[i]--;
					a=a+(char)('a'+i);
					count--;
				}
			}
		}
		System.out.println(a);
	}
}
