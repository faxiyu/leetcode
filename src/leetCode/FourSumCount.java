package leetCode;


import java.util.HashMap;
import java.util.Map;
/**
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，
 * 使得 A[i] + B[j] + C[k] + D[l] = 0。
为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。
所有整数的范围在 -228 到 228 - 1 之间，最终结果不会超过 231 - 1 。
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
