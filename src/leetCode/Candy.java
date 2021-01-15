package leetCode;

import java.util.Arrays;

/**
 * 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
 * 你需要按照以下要求，帮助老师给这些孩子分发糖果：
 * 每个孩子至少分配到 1 个糖果。
 * 相邻的孩子中，评分高的孩子必须获得更多的糖果。
 * @author 14257
 *
 */
public class Candy {
	public static void main(String[] args) {
		int[] ratings = {1,0,2};
		int sum=0;
		int[] left = new int[ratings.length];
		Arrays.fill(left, 1);
		for (int i = 1; i < left.length; i++) {
			if (ratings[i]>ratings[i-1]) {
				left[i]=left[i-1]+1;
			}
		}
		sum+=left[left.length-1];
		int[] right = new int[ratings.length];
		Arrays.fill(right, 1);
		for (int i = right.length-2; i >=0; i--) {
			if (ratings[i]>ratings[i+1]) {
				right[i]=right[i+1]+1;
			}
			sum+=Math.max(left[i], right[i]);
		}
		System.out.println(Arrays.toString(left));
		System.out.println(Arrays.toString(right));
		System.out.println(sum);
	}
}
