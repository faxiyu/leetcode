package leetCode;
/**
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 * 输入: "abab"
 * 输出: True
 * 解释: 可由子字符串 "ab" 重复两次构成。
 * @author 14257
 *
 */


public class ReS {
	public static void main(String[] args) {
		String s = "abababc";
		char[] c = s.toCharArray();
		if (c.length==1) {
			System.out.println("error");
			return ;
		}
		int k=0;
		for (int i = 0; i <c.length ; i++) {
			int b=i;
			for (int j = 0; j <= k; j++) {
				System.out.println(b+"  "+j);
				if (c[b]!=c[j]) {
					k=i;
					System.out.println(k);
					break;
				}
				if (b==c.length-1 && j==k) {
					System.out.println("right");
					return;
				}else if(b==c.length-1) {
					break;
				}else if(j==k) {
					j=-1;
				}
				b++;
			}
			
		}
		System.out.println("error");
		return ;
	}
}	
