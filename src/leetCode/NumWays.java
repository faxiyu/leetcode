package leetCode;
/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��̨�ס������������һ�� n ����̨���ܹ��ж�����������
 * @author 14257
 *
 */
public class NumWays {
	static int sum = 0;

	public static void main(String[] args) {
		int n = 7;
		int sum=zonghe(n);
		System.out.println(sum);
	}

	private static int zonghe(int n) {
		int a = 1, b = 1, sum;
		for (int i = 0; i < n; i++) {
			sum = (a + b) % 1000000007;
			a = b;
			b = sum;
		}
		return a;
	}
}
