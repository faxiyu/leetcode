package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * �����������飬arr1 �� arr2��
 * arr2 �е�Ԫ�ظ�����ͬ
 * arr2 �е�ÿ��Ԫ�ض������� arr1 ��
 * �� arr1 �е�Ԫ�ؽ�������ʹ arr1 ��������˳��� arr2 �е����˳����ͬ��δ�� arr2 �г��ֹ���Ԫ����Ҫ����������� arr1 ��ĩβ��
 * @author 14257
 *
 */
public class RelativeSortArray {
	public static void main(String[] args) {
		int[] arr1= {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		Map<Integer, Integer> map = new TreeMap<>();
		for (int i : arr1) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		int[] arr  = new int[arr1.length];
		int a = 0;
		for (int i : arr2) {
			Integer integer = map.get(i);
			for (int j = 0; j < integer; j++) {
				arr[a] = i;
				a++;
			}
			map.remove(i);
		}
		Set<Integer> keySet = map.keySet();
		for (Integer i : keySet) {
			Integer integer = map.get(i);
			for (int j = 0; j < integer; j++) {
				arr[a] = i;
				a++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
