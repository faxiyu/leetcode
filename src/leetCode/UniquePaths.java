package leetCode;
/**
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为 “Start” ）。
机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为 “Finish” ）。
问总共有多少条不同的路径
 * @author 14257
 *
 */
public class UniquePaths {
	public static void main(String[] args) {
		int m=3;
		int n=2;
		long count=1;
		for (int i = n,y=1; y < m; ++i,++y) {
			count=count*i/y;

		}
		System.out.println(count);
//		return count;
	}
}
