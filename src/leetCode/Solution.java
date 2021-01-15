package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] prices= new int[n];
		for (int i = 0; i < prices.length; i++) {
			prices[i] = sc.nextInt();
		}
		if (n==0) {
			System.out.println(0);
		}
		int[] buy = new int[3];
		int[] sell=new int[3];
		for (int i = 1; i <=2; i++) {
			buy[i]=sell[i]=Integer.MIN_VALUE;
		}
		buy[0] = -prices[0];
		sell[0] = 0;
		for (int i = 1; i < n; i++) {
			buy[0]=Math.max(buy[0], -prices[i]);
			for (int j = 1; j <= 2; j++) {
				sell[j] = Math.max(sell[j], buy[j-1]+prices[i]);
				buy[j]=Math.max(buy[j], sell[j]-prices[i]);
			}
		}
		int max = Arrays.stream(sell).max().getAsInt();
		
		System.out.println(max);
		
	}

}
