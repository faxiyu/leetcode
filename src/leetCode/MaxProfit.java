package leetCode;

import java.util.Arrays;

/**
 * ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
 * ���һ���㷨�����������ܻ�ȡ�������������Ծ����ܵ���ɸ���Ľ��ף��������һ֧��Ʊ����
 * ע�⣺�㲻��ͬʱ�����ʽ��ף���������ٴι���ǰ���۵�֮ǰ�Ĺ�Ʊ����
 * @author 14257
 *
 */
public class MaxProfit {

	public static void main(String[] args) {
		int[] prices= {7,1,5,3,6,4};
		int len=prices.length;
		int sum=0;

        for (int i = 0; i < len-1; i++) {
           if (prices[i]<prices[i+1]) {
        	   sum=sum+prices[i+1]-prices[i];
           }
        }
        System.out.println(sum);
	}

}
