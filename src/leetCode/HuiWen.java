package leetCode;
/**
 * ����һ���ַ��� s�������ͨ�����ַ���ǰ������ַ�����ת��Ϊ���Ĵ����ҵ������ؿ��������ַ�ʽת������̻��Ĵ���
 * ʾ�� 1:
 * ����: "aacecaaa"
 * ���: "aaacecaaa"
 * @author 14257
 *
 */
public class HuiWen {
	public static void main(String[] args) {
		String s = "caac";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String b= null;
		for (int i = 0; i < s.length(); i++) {
			if (sb.substring(i).equals(s.substring(0, s.length()-i))) {
				b = sb.toString()+s.substring(s.length()-i);
				break;
			}
		}
		System.out.println(b);
		
	}
}