package leetCode;

import java.util.Arrays;

/**
 * �����ÿ��������Ϊһ�����ݣ��� i�����ݶ�Ӧ��һ���Ǹ�������������ֵ cost[i](������0��ʼ)��
ÿ��������һ�������㶼Ҫ���Ѷ�Ӧ����������ֵ��Ȼ�������ѡ�������һ�����ݻ������������ݡ�
����Ҫ�ҵ��ﵽ¥�㶥������ͻ��ѡ��ڿ�ʼʱ�������ѡ�������Ϊ 0 �� 1 ��Ԫ����Ϊ��ʼ���ݡ�
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
