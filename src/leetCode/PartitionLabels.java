package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * �ַ��� S ��Сд��ĸ��ɡ�����Ҫ������ַ�������Ϊ�����ܶ��Ƭ�Σ�
 * ͬһ����ĸֻ����������е�һ��Ƭ�Ρ�����һ����ʾÿ���ַ���Ƭ�εĳ��ȵ��б�
 * @author 14257
 *
 */
public class PartitionLabels {
	public static void main(String[] args) {
		String s = "ababcbacadefegdehijhklij";
		int n=0; 
		List<Integer> list = new ArrayList<>();
		for (;n<s.length();) {
			int max=s.lastIndexOf(s.charAt(n));
			for (int i = n; i <= max; i++) {
				int a = s.lastIndexOf(s.charAt(i));
				max=Math.max(a, max);
			}
			list.add(max+1-n);
			n=max+1;
			System.out.println(n);
		}
		System.out.println(list.toString());
	}
}
