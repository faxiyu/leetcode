package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ������ˮ̯�ϣ�ÿһ������ˮ���ۼ�Ϊ 5 ��Ԫ��
�˿��Ŷӹ�����Ĳ�Ʒ�������˵� bills ֧����˳��һ�ι���һ����
ÿλ�˿�ֻ��һ������ˮ��Ȼ�����㸶 5 ��Ԫ��10 ��Ԫ�� 20 ��Ԫ��������ÿ���˿���ȷ���㣬Ҳ����˵��������ÿλ�˿�����֧�� 5 ��Ԫ��
ע�⣬һ��ʼ����ͷû���κ���Ǯ��
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
