package leetCode;
/**
 * ���ַ��� s ���ҳ���һ��ֻ����һ�ε��ַ������û�У�����һ�����ո� s ֻ����Сд��ĸ��
 * @author 14257
 *
 */
public class FirstUniqChar {
	public static void main(String[] args) {
		String s = "";
		//
//		String s = "leetcode";
//		for (char c : s.toCharArray()) {
//			if (s.indexOf(c)==s.lastIndexOf(c)) {
//				System.out.println(c);
//				break;
//			}
//			
//		}
//		System.out.println(" ");
//
		if (s.length()==1) {
			System.out.println(s);
		}
		char a=' ';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='/') {
				continue;
			}else if(i==s.length()) {
				a=s.charAt(i);
				break;
			}
			if(s.substring(i+1).indexOf(s.charAt(i))==-1) {
				a=s.charAt(i);
				break;
			}else {
				s=s.replace(s.charAt(i), '/');
			}
		}
		System.out.println(a);
		
	}
}
