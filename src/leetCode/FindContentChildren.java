package leetCode;

import java.util.Arrays;

/**
 * ��ÿ������ i������һ��θ��ֵ g[i]���������ú���������θ�ڵı��ɵ���С�ߴ磻����ÿ����� j������һ���ߴ� s[j] ��
 * ��� s[j] >= g[i]�����ǿ��Խ�������� j ��������� i ��������ӻ�õ����㡣
 * ���Ŀ���Ǿ���������Խ�������ĺ��ӣ��������������ֵ��
 * @author 14257
 *
 */
public class FindContentChildren {
	public static void main(String[] args) {
		int[] g = {1,2,3};
		int[] s= {1,1};
		Arrays.sort(g);
		Arrays.sort(s);
		int j=0;
		int sum=0;
		for (int i:g) {
			for ( ; j < s.length;j++ ) {
				if (i<=s[j]) {
					sum++;
					j++;
					break;
				}
			}
			if (j==s.length) {
				break;
			}
		}
		System.out.println(sum);
	}
}
