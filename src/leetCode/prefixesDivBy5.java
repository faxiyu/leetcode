package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定由若干 0 和 1 组成的数组 A。我们定义 N_i：从 A[0] 到 A[i] 的第 i 个子数组被解释为一个二进制数（从最高有效位到最低有效位）。
返回布尔值列表 answer，只有当 N_i 可以被 5 整除时，答案 answer[i] 为 true，否则为 false。
 * @author 14257
 *
 */
public class prefixesDivBy5 {

	public static void main(String[] args) {
		int[] A = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
		List<Boolean> list = new ArrayList<>();
		
		int sum=0;
		for (int i :A) {
			sum=((sum<<1)+i)%5;
			list.add(sum==0);
		}
		System.out.println(list);

	}

}
