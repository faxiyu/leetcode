package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int sum=0;
		int fsum=0;
		int fc = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int a=sc.nextInt();
			list.add(a);
			if (a>0) {
				sum+=a;
			}else {
				fc++;
				fsum+=a;
			}
		}
		int zx=0;
		int fzx=0;
		for (int i = 0, j=1; j<=n;j++) {
			if (i>=fc) {
				zx+=j;
				continue;
			}else if (i<fc) {
				i++;
				fzx+=j;
			}
		}
		result=sum-zx+fzx-fsum;
		System.out.println(result);
		
	}
}
