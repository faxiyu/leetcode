package leetCode;
/**
 * ����һ���ַ��� s���ҵ� s ����Ļ����Ӵ�������Լ��� s ����󳤶�Ϊ 1000��
 * ����: "babad"
 * ���: "bab"
 * ע��: "aba" Ҳ��һ����Ч�𰸡�
 *  @author 14257
 *
 */
public class LongestPalindrome {
	public static void main(String[] args) {
		String s = "aaabaaaa";
		if (s == null || s.length() < 1) System.out.println("");;
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s, i, i);
			int len2 = expandAroundCenter(s, i, i + 1);
			int len = Math.max(len1, len2);
			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}
		System.out.println(s.substring(start, end + 1)); 
	}

	private static int expandAroundCenter(String s, int left, int right) {
		int L = left, R = right;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		return R - L - 1;
	}
}
