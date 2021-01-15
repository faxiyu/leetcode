package leetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Generate {
	public static void main(String[] args) {
		int numRows = 5;
		List<List<Integer>> list = new ArrayList<>();
		if (numRows<1) {
			System.out.println(list);
		}
		for (int i = 0; i < numRows; i++) {
			List<Integer> l = new ArrayList<>();
			if (i==0) {
				l.add(1);
			}else {
				for (int j = 0; j <=i; j++) {
					if (j==0||j==i) {
						l.add(list.get(i-1).get(0));
					}else {
						l.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
					}
				}
			}
			list.add(l);
		}
		System.out.println(list.toString());
	}
}
