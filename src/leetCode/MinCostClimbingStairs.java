package leetCode;

import java.util.Arrays;

/**
 * 数组的每个索引作为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
 * @author 14257
 *
 */
public class MinCostClimbingStairs {
//	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) {
		int[] cost= {1, 100, 1, 1, 1, 100, 1, 1, 1, 100};
		
		for (int i = 2; i < cost.length; i++) {
			cost[i] = Math.min(cost[i-2], cost[i-1])+cost[i];
		}
//		return Math.min(cost[cost.length-2],cost[cost.length-1]);
		
		
//		huisu(cost,0,0);
//		huisu(cost,1,0);
//		System.out.println(min);
//	}
//	private static void huisu(int[] cost, int i,int sum) {
//		if (i>=cost.length) {
//			min=Math.min(min, sum);
//			return ;
//		}
//		huisu(cost, i+1, sum+cost[i]);
//		huisu(cost, i+2, sum+cost[i]);
//		
	}
}
