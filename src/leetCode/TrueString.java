package leetCode;

import java.util.Scanner;

public class TrueString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s="1";
		StringBuffer sb = new StringBuffer(s);
		int count=0;
		//ȥ�����಻�ɶ�')'
		for (int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i)==')') {
				if (count==0) {
					sb.deleteCharAt(i);
					i--;
					continue;
				}
				count--;
			}
			if (sb.charAt(i)=='(') {
				count++;
			}
		}
		//����ɶ��򷵻�
		if (count==0) {
			System.out.println(sb.toString());
			return ;
		}
		//ȥ�����಻�ɶ�'('
		count=0;
		for (int i = sb.length()-1; i >=0 ; i--) {
			if(sb.charAt(i)=='(') {
				if (count==0) {
					sb.deleteCharAt(i);
					continue;
				}
				count--;
			}
			if (sb.charAt(i)==')') {
				count++;
			}
		}
		System.out.println(sb.toString());
	}
}
