package leetCode;
/**
 * ����һ���Ǹ����� N���ҳ�С�ڻ���� N ������������ͬʱ���������Ҫ���������λ���ϵ������ǵ���������
 * �����ҽ���ÿ������λ���ϵ����� x �� y ���� x <= y ʱ�����ǳ���������ǵ��������ġ���
 * @author 14257
 *
 */
public class MonotoneIncreasingDigits {
	public static void main(String[] args) {
		int N=120;
		String string = Integer.toString(N);
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			boolean b=true;
			for (int j = i+1; j < string.length(); j++) {
				if (c>string.charAt(j)) {
					b=false;
					break;
				}else if (c==string.charAt(j)) {
					continue;
				}else {
					break;
				}
			}
			if (b) {
				s.append(c);
			}else {
				Integer valueOf = Integer.valueOf(c)-48;
				s.append(valueOf-1);
				break;
			}
		}
		while (string.length()-s.length()>0) {
			s.append(9);
		}
//		return (int)Integer.valueOf(s);
		System.out.println(Integer.valueOf(s.toString()));
	}
}
