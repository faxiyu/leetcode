package leetCode;
/**
 * ����һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������ڣ��򷵻� -1��
 * @author 14257
 *
 */
public class FirstUniqChar1 {
	public static void main(String[] args) {
		String s = "leetcode";
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				System.out.println(i);
				return ;
			}
		}
		System.out.println(s.length()-1);
	}
}
