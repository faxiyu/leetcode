package leetCode;
/**
 * ʵ�ֺ���double Power(double base, int exponent)����base��exponent�η���
 * ����ʹ�ÿ⺯����ͬʱ����Ҫ���Ǵ������⡣
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
			if((n&1)==1) pow=pow*x;//�������x
			x*=x;
			n>>=1;
		}
		System.out.println(pow);
	}
}
