package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������Сд��ĸ��ɵ��ַ������� A�������б��е�ÿ���ַ����ж���ʾ��ȫ���ַ��������ظ��ַ�����ɵ��б�
 * ���磬���һ���ַ���ÿ���ַ����г��� 3 �Σ������� 4 �Σ�����Ҫ�����մ��а������ַ� 3 �Ρ�
 * @author 14257
 *
 */
public class CommonChars {
	public static void main(String[] args) {
		String[] A= {"bella","label","roller"};
		List< String> s = new ArrayList<>();
		int[] count = new int[26];
		for (int i = 0; i < A[0].length(); i++) {
			count[A[0].charAt(i)-'a']++;
		}
		for (int i = 1; i < A.length; i++) {
			int icount[] = new int[26];
			for (int j = 0; j < A[i].length(); j++) {
				icount[A[i].charAt(j)-'a']++;
			}
			for (int j = 0; j < icount.length; j++) {
				count[j]=Math.min(count[j], icount[j]);
			}
		}
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count[i]; j++) {
				s.add(String.valueOf((char)('a'+i)));				
			}
		}
		
	}
}
