package leetCode;
/**
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999
 * @author 14257
 *
 */
public class PrintNumbers {
	static StringBuffer sb;
	static int n,count=0,start,nine=0;
	static char[] nums,loop= {'0','1','2','3','4','5','6','7','8','9'};
	
	public static void main(String[] args) {
		n=3;
		//大数（越界）采用字符串
		nums=new char[n];
		sb=new StringBuffer();
		start=n-1;					//开始固定位置（目的：消除多余的0）
		dfs(0);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb.toString());

		
		
//		int length=(int)Math.pow(10, n);
//		int[] a = new int[length];
//		for (int i = 1; i < length; i++) {
//			a[i-1]=i;
//		}
	}

	private static void dfs(int i) {//i表示固定位数
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
