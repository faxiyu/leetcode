package leetCode;


/**
 * ����һ���������� prices�����е� i ��Ԫ�ش����˵� i ��Ĺ�Ʊ�۸� ���Ǹ����� fee �����˽��׹�Ʊ���������á�
��������޴ε���ɽ��ף�������ÿ�ʽ��׶���Ҫ�������ѡ�������Ѿ�������һ����Ʊ����������֮ǰ��Ͳ����ټ��������Ʊ�ˡ�
���ػ����������ֵ��
 * @author 14257
 *��̬�滮
 *һ��Ķ�̬�滮��Ŀ˼·�����ߣ�

����״̬ת�Ʒ���
����ת�Ʒ��̳�ʼֵ
д�������ʵ��ת�Ʒ���
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
