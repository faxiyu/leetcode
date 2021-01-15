package leetCode;
/**
 * ì³²¨ÄÇÆõÊý
 * @author 14257
 *
 */
public class Fib {
	public static void main(String[] args) {
		int n=3;
		if (n<=1) {
//			return n;
		}
		int a=0;
		int b=1;
		for (int i = 2; i <=n; i++) {
			int m=a;
			a=b;
			b+=m;
		}
		System.out.println(b);
	}
}
