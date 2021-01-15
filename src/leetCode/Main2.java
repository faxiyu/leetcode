package leetCode;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n1=sc.nextInt();
			String n = sc.next();
			StringBuffer sb = new StringBuffer(n); 
			int m = sc.nextInt();
			String p= sc.next();
			for (int j = 0; j < p.length(); j++) {
				int w=-1;
				if (p.charAt(j)=='M') {
					boolean b=false;
					for (int k = 0; k < sb.length(); k++) {
						if (sb.charAt(k)=='0'&&w==-1) {
							w=k;
						}
						if (sb.charAt(k)=='1') {
							w=k;
							sb.replace(w, w+1, "2");
							b=true;
							break;
						}
					}
					System.out.println(w+1);
					if (!b) {
						sb.replace(w, w+1, "1");						
					}
				}else {
					boolean b=false;
					for (int k = 0; k < sb.length(); k++) {
						if (sb.charAt(k)=='1'&&w==-1) {
							w=k;
						}
						if (sb.charAt(k)=='0') {
							w=k;
							sb.replace(w, w+1, "1");
							b=true;
							break;
						}
					}
					System.out.println(w+1);
					if (!b) {
						sb.replace(w, w+1, "2");						
					}
				}
				
			}
		}
	}
}
