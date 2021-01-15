package leetCode;

import java.util.Stack;

/**
 * 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 * @author 14257
 *单调栈
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
