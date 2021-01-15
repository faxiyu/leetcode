package leetCode;
/**
 * 
 * ���� S �� T �����ַ����������Ƿֱ����뵽�հ׵��ı��༭�����ж϶����Ƿ���ȣ������ؽ���� # �����˸��ַ���
 * @author 14257
 *
 */
public class BackspaceCompare {
	public static void main(String[] args) {
		String s = "a##c";
		String t = "#a#c";
		String s1 =  z(s);
		String t1 = z(t);
		System.out.println(s1+" "+t1 );
		System.out.println(s1.equals(t1));
	}

	private static String z(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='#') {
				if (sb.length()==0) {
					continue;
				}
				sb.deleteCharAt(sb.length()-1);
			}else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
}
