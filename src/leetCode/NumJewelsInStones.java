package leetCode;
/**
 *  �����ַ���J ����ʯͷ�б�ʯ�����ͣ����ַ��� S������ӵ�е�ʯͷ�� 
 *  S ��ÿ���ַ�������һ����ӵ�е�ʯͷ�����ͣ�
 *  ����֪����ӵ�е�ʯͷ���ж����Ǳ�ʯ��
 *  J �е���ĸ���ظ���J �� S�е������ַ�������ĸ����ĸ���ִ�Сд�����"a"��"A"�ǲ�ͬ���͵�ʯͷ��
 *  ʾ�� 1:
 *  ����: J = "aA", S = "aAAbbbb"
 *  ���: 3
 * @author 14257
 *
 */
public class NumJewelsInStones {
	public static void main(String[] args) {
		String j  = "aA";
		String s = "aAAbbbb";
		System.out.println(s.replaceAll("[^"+ j + "]", "").length());
		int sum=0;
		for(int i=0;i<s.length();i++) {
			int indexOf = j.indexOf(s.charAt(i));
			if (indexOf!=-1) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
