package leetCode;
/**
 * ����һ�������� n �����������еĵ� n �
 * ��������С���һ���������У������� 1 ��ʼ�������е�ÿһ��Ƕ�ǰһ���������
 * ����Խ����������ɵݹ鹫ʽ����������ַ������У�
 * countAndSay(1) = "1"
 * countAndSay(n) �Ƕ� countAndSay(n-1) ��������Ȼ��ת������һ�������ַ�����
 * @author 14257
 *
 */
public class CountAndSay {
	public static void main(String[] args) {
		int n=5;
		String s = "1";
		String ss = "";
		for (int i = 0; i < n-1; i++) {
			int count = 0;
			char c=s.charAt(0);
			for (int j = 0; j < s.length(); j++) {
				if (j!=0&&s.charAt(j)!=s.charAt(j-1)) {
					ss+=count+String.valueOf(c);
					count=0;
					c=s.charAt(j);
				}
				count++;
			}
			ss+=count+String.valueOf(c);
			s=ss;
			System.out.println(s);
			ss="";
		}
		System.out.println(s);
	}
}
