package leetCode;


import java.util.HashMap;
import java.util.Map;
/**
 * �����ĸ����������������б� A , B , C , D ,�����ж��ٸ�Ԫ�� (i, j, k, l) ��
 * ʹ�� A[i] + B[j] + C[k] + D[l] = 0��
Ϊ��ʹ����򵥻������е� A, B, C, D ������ͬ�ĳ��� N���� 0 �� N �� 500 ��
���������ķ�Χ�� -228 �� 228 - 1 ֮�䣬���ս�����ᳬ�� 231 - 1 ��
 * @author 14257
 *
 */
public class FourSumCount {
	static int count=0;
	
	public static void main(String[] args) {
		int[] A = {1,2};
		int[] B = {-2,-1};
		int[] C = {-1,2};
		int[] D = {0,2};
		int count=0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : A) {
			for (int j : B) {
				map.put(i+j, map.getOrDefault(i+j, 0)+1);
			}
		}
		for (int i : D) {
			for (int j : C) {
				count += map.getOrDefault(-(i+j),0);
				
			}
		}
		System.out.println(count);
		
	}
}
