package leetCode;

import java.util.Stack;

/**
 * ���� n ���Ǹ�������������ʾ��״ͼ�и������ӵĸ߶ȡ�ÿ�����ӱ˴����ڣ��ҿ��Ϊ 1 ��
 * ���ڸ���״ͼ�У��ܹ����ճ����ľ��ε���������
 * @author 14257
 *����ջ
 */
public class LargestRectangleArea {
	public static void main(String[] args) {
		int[] heights= {2,1,5,6,2,3};
		int max=0;
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < heights.length; i++) {
			while(!stack.isEmpty()&&heights[i]<heights[stack.peek()]) {
				int high=heights[stack.pop()];
				int width;
				if (stack.isEmpty()) {
					width=i;
				}else {
					width=i-stack.peek()-1;
				}
				max=Math.max(max, width*high);
				System.out.println(width+"   "+high);
			}
			stack.add(i);
		}
		while(!stack.isEmpty()) {
			int high = heights[stack.pop()];
			int width;
			if (stack.isEmpty()) {
				width=heights.length;
			}else {
				width=heights.length-stack.peek()-1;
			}
			max=Math.max(max, width*high);
			System.out.println(width+"   "+high);

		}
		System.out.println(stack);
		System.out.println(max);
		
	}
}
