package leetCode;
/**
 * ����һ������ 0 �� 1 �Ķ�ά�����ͼ������ 1 ��ʾ½�� 0 ��ʾˮ��
 * �����еĸ���ˮƽ�ʹ�ֱ�����������Խ��߷�����������
 * ��������ˮ��ȫ��Χ��������ǡ����һ�����죨����˵��һ��������ʾ½�صĸ���������ɵĵ��죩��
 * ������û�С������������� ָˮ���ڵ����ڲ��Ҳ��͵�����Χ��ˮ��������
 * �����Ǳ߳�Ϊ 1 �������Ρ�����Ϊ�����Σ��ҿ�Ⱥ͸߶Ⱦ������� 100 ���������������ܳ���
 * @author 14257
 *
 */
public class IslandPerimeter {
	public static void main(String[] args) {
		int[][] grid = {{0,1,0,0},
						{1,1,1,0},
						{0,1,0,0},
						{1,1,0,0}};
		int sum=0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j]==1) {
					sum+=bs(grid,i,j);
				}
			}
		}
		System.out.println(sum);
	}

	private static int bs(int[][] grid, int i, int j) {
		int sum=0;
		if (i==0) {
			sum++;
		}
		if (i==grid.length-1) {
			sum++;
		}
		if (j==0) {
			sum++;
		}
		if (j==grid[0].length-1) {
			sum++;
		}
		if (i-1>=0&&grid[i-1][j]!=1) {
			sum++;
		}
		if (i+1<=grid.length-1&&grid[i+1][j]!=1) {
			sum++;
		}
		if (j-1>=0&&grid[i][j-1]!=1) {
			sum++;
		}
		if (j+1<=grid[0].length-1&&grid[i][j+1]!=1) {
			sum++;
		}
		return sum;
	}
}
