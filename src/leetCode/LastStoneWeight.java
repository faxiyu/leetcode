package leetCode;

import java.util.Arrays;

/**
 * ��һ��ʯͷ��ÿ��ʯͷ������������������
ÿһ�غϣ�����ѡ������ ���ص� ʯͷ��Ȼ������һ����顣����ʯͷ�������ֱ�Ϊ x �� y���� x <= y����ô����Ŀ��ܽ�����£�
��� x == y����ô����ʯͷ���ᱻ��ȫ���飻
��� x != y����ô����Ϊ x ��ʯͷ������ȫ���飬������Ϊ y ��ʯͷ������Ϊ y-x��
������ֻ��ʣ��һ��ʯͷ�����ش�ʯͷ�����������û��ʯͷʣ�£��ͷ��� 0��
 * @author 14257
 *
 */
public class LastStoneWeight {
	public static void main(String[] args) {
		int[] stones = {2,7,4,1,8,1};
		Arrays.sort(stones);
		int length = stones.length;
		while(length>1&&stones[length-2]!=0) {
			stones[length-1] = stones[length-1]-stones[length-2];
			stones[length-2]=0;
			Arrays.sort(stones);
		}
		System.out.println(Arrays.toString(stones));
	}
}
