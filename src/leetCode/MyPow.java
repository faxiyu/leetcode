package leetCode;
/**
 * 实现函数double Power(double base, int exponent)，求base的exponent次方。
 * 不得使用库函数，同时不需要考虑大数问题。
 * @author 14257
 *
 */

public class MyPow {
	public static void main(String[] args) {
		double x= 2.00000;
		int n=3;
		double pow=1.0;
		if (n<0) {
			n=-n;
			x=1/x;
		}
		while (n>0) {
			if((n&1)==1) pow=pow*x;//奇数多乘x
			x*=x;
			n>>=1;
		}
		System.out.println(pow);
	}
}
