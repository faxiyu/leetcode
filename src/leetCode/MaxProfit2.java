package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ����һ���������� prices �����ĵ� i ��Ԫ�� prices[i] ��һ֧�����Ĺ�Ʊ�ڵ� i ��ļ۸�
 * ���һ���㷨�����������ܻ�ȡ�������������������� k �ʽ��ס�
 * ע�⣺�㲻��ͬʱ�����ʽ��ף���������ٴι���ǰ���۵�֮ǰ�Ĺ�Ʊ����
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
        int[] buy = new int[k + 1];//�� buy[j] ��ʾ�������� prices[0..i] �еļ۸���ԣ�����ǡ�� j �ʽ���
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
