package leetCode;
/**
 *给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​
设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:
你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
 * @author 14257
 *
 */
public class MaxProfit3 {
	public static void main(String[] args) {
		int[] prices = {1,2,3,0,2};
		int buy=-prices[0];//当天手中持有股票
		int sell = Integer.MIN_VALUE;//不持有，进入冷冻期,说明前一天必须持有
		int cold = 0;//不持有，不处于冷冻期
		for (int i = 1; i < prices.length; i++) {
			int no = cold;
			cold = Math.max(cold, sell);
			sell = buy + prices[i];
			buy = Math.max(buy, no-prices[i]);
		}
		System.out.println(Math.max(cold, sell));
	}
}
