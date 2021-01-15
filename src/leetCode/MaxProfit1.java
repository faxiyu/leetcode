package leetCode;


/**
 * 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
返回获得利润的最大值。
 * @author 14257
 *动态规划
 *一般的动态规划题目思路三步走：

定义状态转移方程
给定转移方程初始值
写代码递推实现转移方程
 */
public class MaxProfit1 {
	public static void main(String[] args) {
		int[] prices= {1,3,2,8,4,9};
		int fee=2;
		int[] dp = new int[2];
		dp[0]=0;
		dp[1]=-prices[0];
		for (int i = 1; i < prices.length; i++) {
			dp[0]=Math.max(dp[0], dp[1]+prices[i]-fee);
			dp[1]=Math.max(dp[1], dp[0]-prices[i]);
		}
		System.out.println(dp[0]);	
		
	}
//		int huisu = huisu(prices,fee,prices[0],1,0);
//		System.out.println(huisu);
//
//	}
//	private static int huisu(int[] prices, int fee, int min, int i,int sum) {
//		if (i==prices.length) {
//			return sum;
//		}
//		if (prices[i]<min) {
//			min=prices[i];
//		}
//		return Math.max(huisu(prices, fee, prices[i], i+1, sum+prices[i]-min-fee),huisu(prices, fee, min, i+1, sum));
//	}
}
