package leetCode;

import java.util.Arrays;

public class CountPrimes {
	public static void main(String[] args) {
		int n=10;
		if (n<=2) {
//			return 0;
		}
		int count=0;
		boolean[] zs= new boolean[n];
		Arrays.fill(zs,true);
		for (int i = 2; i*i <=n; i++) {
			if (zs[i]) {
				for (int j = i*i; j < n; j=j+i) {
					zs[j]=false;
				}
			}
		}
		for (boolean b : zs) {
			if (b) {
				count++;
			}
		}
//		return count-2;
	}
}