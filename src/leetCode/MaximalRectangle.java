package leetCode;

import java.util.Stack;

/**
 * ����һ�������� 0 �� 1 ����СΪ rows x cols �Ķ�ά�����ƾ����ҳ�ֻ���� 1 �������Σ��������������
 * @author 14257
 *largestRectangleArea
 */
public class MaximalRectangle {
	public static void main(String[] args) {
		char[][] matrix = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
		int[] heights=new int[matrix[0].length];
		int max=0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j]=='1') {
					heights[j]+=1;
				}else {
					heights[j]=0;
				}
			}
			max=Math.max(largestRectangleArea(heights),max);
		}
		System.out.println(max);
	}

	private static int largestRectangleArea(int[] heights) {
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

		}
		return max;
	}
}
