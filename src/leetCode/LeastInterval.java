package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * ����һ�����ַ����� tasks ��ʾ�� CPU ��Ҫִ�е������б�����ÿ����ĸ��ʾһ�ֲ�ͬ���������
 * �������������˳��ִ�У�����ÿ�����񶼿����� 1 ����λʱ����ִ���ꡣ
 * ���κ�һ����λʱ�䣬CPU �������һ�����񣬻��ߴ��ڴ���״̬��
 * Ȼ�������� ��ͬ���� ������֮������г���Ϊ���� n ����ȴʱ�䣬
 * ������������� n ����λʱ���� CPU ��ִ�в�ͬ�����񣬻����ڴ���״̬��
 * ����Ҫ�������������������Ҫ�� ���ʱ�� ��
 * @author 14257
 *
 */
public class LeastInterval {
	public static void main(String[] args) {
		char[] tasks = {'A','B','A','B','A','B','C','D','A','A','A','G'};
		int n=2;
		int[] chars = new int[26];
		for (char c : tasks) {
			chars[c-'A']++;
		}
		Arrays.sort(chars);
		int length=0;
		while(true) {
			int count=0;
			for (int i = 25; i >=0&&count<n+1; i--) {
				if (chars[i]==0) {
					break;
				}else {
					chars[i]--;
					count++;
				}
			}
			Arrays.sort(chars);
			if (chars[25]==0) {
				length+=count;
				break;
			}else {
				length+=n+1;
			}
			
		}
		System.out.println(length);
				
	}
	
}
