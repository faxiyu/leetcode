package leetCode;

import java.util.Arrays;

import org.omg.PortableServer.ID_ASSIGNMENT_POLICY_ID;

/**
 * ��һ�������ַ������ݸ������������Դ������¡������ҽ��� Z �������С�
 * ���������ַ���Ϊ "LEETCODEISHIRING" ����Ϊ 3 ʱ���������£�
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * ֮����������Ҫ�����������ж�ȡ��������һ���µ��ַ��������磺"LCIRETOESIIGEDHN"
 * @author 14257
 *
 */
public class Convert {
	public static void main(String[] args) {
		String s = "ABC";
		int numRows = 1;
		if (numRows<2) {
			System.out.println(s);
		}
		boolean b=true;
		int a=0;
		String[] sb = new String[numRows];
		for (int i = 0; i < s.length(); i++) {
			if (a==0) {
				b=true;
			}
			if (a==numRows-1) {
				b=false;
			}
			sb[a]+=s.charAt(i);
			if (b) {
				a++;
			}else {
				a--;
			}
		}
		String ss = "";
		for (String string : sb) {
			if (string==null) {
				break;
			}
			ss+=string.substring(4);
		}
		System.out.println(ss);
	}
}
