package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int a[]=new int[n];
			Map<Integer, Integer> map =new HashMap<Integer, Integer>();
			for (int j = 1; j < a.length; j++) {
				a[j]=sc.nextInt();
				map.put(a[j], map.getOrDefault(a[j], 0)+1);
			}
			Set<Integer> keySet = map.keySet();
			for (Integer integer : keySet) {
				
			}
			System.out.println(map.keySet().size());
			
			
		}
	}
}
