package leetCode;

import java.util.Arrays;

/**
 * Dota2 ����������������Ӫ��Radiant(���)�� Dire(ҹ��)
Dota2 ����Ժ���������ɵĲ���Ա��ɡ����ڲ���Ժϣ����һ�� Dota2 ��Ϸ��ĸı�����������������һ��������Ϊ���̵�ͶƱ���С���ÿһ���У�ÿһλ����Ա��������ʹ����Ȩ���е�һ�
��ֹһ������Ա��Ȩ����
����Ա��������һλ����Ա����һ�ֺ����ļ�����ɥʧ���е�Ȩ����
����ʤ����
          �������Ա������Ȩ��ͶƱ�Ĳ���Ա����ͬһ����Ӫ�ģ�����������ʤ������������Ϸ�е��йر仯��
����һ���ַ�������ÿ������Ա����Ӫ����ĸ ��R�� �� ��D�� �ֱ������ Radiant����ԣ��� Dire��ҹ�ʣ���Ȼ������� n ������Ա�������ַ����Ĵ�С���� n��
����Ϊ�����Ĺ��̴Ӹ���˳��ĵ�һ������Ա��ʼ�����һ������Ա��������һ���̽�������ͶƱ����������ʧȥȨ���Ĳ���Ա���ڹ����б�������
����ÿһλ����Ա���㹻��������Ϊ�Լ�������������õĲ��ԣ�����ҪԤ����һ�����ջ�����ʤ������ Dota2 ��Ϸ�о����ı䡣���Ӧ���� Radiant �� Dire��
 * @author 14257
 *
 */
public class PredictPartyVictory {
	public static void main(String[] args) {
		String senate = "DRRDRDRDRDDRDRDR";
		StringBuilder sb = new StringBuilder(senate);
		for (; ;) {
			for (int i = 0; i < sb.length(); i++) {
				if (!sb.toString().contains("R")) {
					System.out.println("D");
//					return "Dire";
				}else if(!sb.toString().contains("D")) {
					System.out.println("R");
//					return "Radiant";
				}
				int indexOf;
				if (sb.charAt(i)=='R') {
					indexOf = sb.indexOf("D",i);
					if (indexOf==-1) {
						indexOf=sb.indexOf("D");
					}
				}else {
					indexOf = sb.indexOf("R",i);
					if (indexOf==-1) {
						indexOf=sb.indexOf("R");
					}
				}
				sb.deleteCharAt(indexOf);
				if (indexOf<=i) {
					i--;
				}
			}
		}
	}

}
