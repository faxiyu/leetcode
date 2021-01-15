package leetCode;

import java.util.Scanner;

/**
 * 阶乘溢出
 * 
 * @author 14257
 *
 */
public class JieCheng {
	static int flag=0;
	public static void main(String[] args) {
		int[] arr = new int[100000];
		arr[0]=1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			arr = demo(arr, i);
		}
		for (int i = flag; i >=0; i--) {
			System.out.print(arr[i]);
		}
	}

	private static int[] demo(int[] arr, int num) {
		for (int i = 0; i <=flag; i++) {
			arr[i] *= num;// 计算每一位
		}
		// 进和留
		for (int i = 0; i <= flag||arr[i]!=0; i++) {
			arr[i+1] = arr[i+1]+arr[i] / 10;
			arr[i] = arr[i] % 10;
			if (i>flag) {
				flag=i;				
			}
		}
		
		return arr;
	}
}
