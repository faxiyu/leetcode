package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个整数数组 prices ，它的第 i 个元素 prices[i] 是一支给定的股票在第 i 天的价格。
 * 设计一个算法来计算你所能获取的最大利润。你最多可以完成 k 笔交易。
 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 * @author 14257
 *
 */
public class MaxProfit2 {
	public static void main(String[] args) {
		int k=2;
		int[] prices = {1,2,4,2,5,7,2,4,9,0};
		if (prices.length == 0) {
//            return 0;
        }

        int n = prices.length;
        k = Math.min(k, n / 2);
        int[] buy = new int[k + 1];//用 buy[j] 表示对于数组 prices[0..i] 中的价格而言，进行恰好 j 笔交易
        int[] sell = new int[k + 1];

        buy[0] = -prices[0];
        sell[0] = 0;
        for (int i = 1; i <= k; ++i) {
            buy[i] = sell[i] = Integer.MIN_VALUE / 2;
        }
        System.out.println(Arrays.toString(sell));
        for (int i = 1; i < n; ++i) {
            buy[0] = Math.max(buy[0], sell[0] - prices[i]);
            for (int j = 1; j <= k; ++j) {
            	sell[j] = Math.max(sell[j], buy[j - 1] + prices[i]);   
                buy[j] = Math.max(buy[j], sell[j] - prices[i]);
            }
            System.out.println(Arrays.toString(sell));
        }
        System.out.println(Arrays.stream(prices).max().getAsInt());
         System.out.println(Arrays.stream(sell).max().getAsInt());
	}
}
