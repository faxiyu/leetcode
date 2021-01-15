package leetCode;

import java.util.Arrays;

/**
 * ��ʦ��������Ƿַ��ǹ����� N ������վ����һ��ֱ�ߣ���ʦ�����ÿ�����ӵı��֣�Ԥ�ȸ��������֡�
 * ����Ҫ��������Ҫ�󣬰�����ʦ����Щ���ӷַ��ǹ���
 * ÿ���������ٷ��䵽 1 ���ǹ���
 * ���ڵĺ����У����ָߵĺ��ӱ����ø�����ǹ���
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
