package leetCode;
/**
 * һ��������λ��һ�� m x n ��������Ͻ� ����ʼ������ͼ�б��Ϊ ��Start�� ����
������ÿ��ֻ�����»��������ƶ�һ������������ͼ�ﵽ��������½ǣ�����ͼ�б��Ϊ ��Finish�� ����
���ܹ��ж�������ͬ��·��
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
