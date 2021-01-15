package leetCode;
/**
 * �������� n����˳���ӡ���� 1 ������ n λʮ���������������� 3�����ӡ�� 1��2��3 һֱ������ 3 λ�� 999
 * @author 14257
 *
 */
public class PrintNumbers {
	static StringBuffer sb;
	static int n,count=0,start,nine=0;
	static char[] nums,loop= {'0','1','2','3','4','5','6','7','8','9'};
	
	public static void main(String[] args) {
		n=3;
		//������Խ�磩�����ַ���
		nums=new char[n];
		sb=new StringBuffer();
		start=n-1;					//��ʼ�̶�λ�ã�Ŀ�ģ����������0��
		dfs(0);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());

		
		
//		int length=(int)Math.pow(10, n);
//		int[] a = new int[length];
//		for (int i = 1; i < length; i++) {
//			a[i-1]=i;
//		}
	}

	private static void dfs(int i) {//i��ʾ�̶�λ��
		if (i==n) {
			sb.append(String.valueOf(nums).substring(start));
			sb.append(" ");
			if (n-start==nine) 	start--;
			return ;
		}
		for(char c:loop) {
			if(c=='9') nine++;
			nums[i]=c;
			dfs(i+1);
		}
		nine--;
		
	}
}
