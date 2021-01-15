package leetCode;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] nums = new int[n];
		nums[0]=sc.nextInt();
		int min=nums[0];
		int max=nums[0];
		int inw=0,axw=0;
		for (int i = 1; i < nums.length; i++) {
			nums[i]=sc.nextInt();
			if (min>nums[i]) {
				min=nums[i];
				inw=i;
			}
			if (max<nums[i]) {
				max=nums[i];
				axw=i;
			}
		}
		int result=min*(nums[inw-1]+nums[inw+1]+max)+nums[1]*nums[inw-1];
		System.out.println(result);
		
	}
}
