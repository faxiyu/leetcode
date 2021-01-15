package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，
 * 同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
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
