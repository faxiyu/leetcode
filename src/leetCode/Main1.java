package leetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i]=sc.nextInt();
		}
		Arrays.sort(nums);
		for (int i = x,j=y; i <=j;) {
			if (i+j<n) {
				i++;
			}else if (i+j>n) {
				j--;
			}else {
				if (n==1) {
					System.out.println(nums[0]);
				}else {
					System.out.println(nums[i-1]);					
				}
				return ;
			}
		}
		System.out.println(-1);
	}
}
