package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 在柠檬水摊上，每一杯柠檬水的售价为 5 美元。
顾客排队购买你的产品，（按账单 bills 支付的顺序）一次购买一杯。
每位顾客只买一杯柠檬水，然后向你付 5 美元、10 美元或 20 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 5 美元。
注意，一开始你手头没有任何零钱。
 * @author 14257
 *
 */
public class LemonadeChange {
	public static void main(String[] args) {
		int[] bills = {10,10};
		Map<Integer, Integer> map = new HashMap<>();
		map.put(5, 0);
		map.put(10, 0);
		for (int i : bills) {
			if (i==5) {
				map.put(i,map.getOrDefault(i, 0)+1);
			}else {
				if (i==10&&map.get(5)>0) {
					map.put(5, map.get(5)-1);
					map.put(10,map.getOrDefault(10, 0)+1);
				}else if(map.get(5)>0&&map.get(10)>0) {
					map.put(5, map.get(5)-1);
					map.put(10, map.get(10)-1);
					
				}else if (map.get(5)>2) {
					map.put(5,map.get(5)-3);
				}else {
//					System.out.println(false);
//					return false;
				}
			}
		}
//		System.out.println(true);
//		return true;
		
	}
}
