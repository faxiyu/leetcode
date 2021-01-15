package leetCode;

import java.util.Arrays;

/**
 * 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。
 * 如果 s[j] >= g[i]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。
 * 你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
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
