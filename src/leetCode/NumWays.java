package leetCode;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
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
