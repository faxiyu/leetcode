package leetCode;

public class Solution2 {
	
	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int get_combination_count = s.get_combination_count(500);
		System.out.println(get_combination_count);
	}
	public int get_combination_count (int stock_count) {
		if (stock_count<=200) {
			return stock_count/100;
		}
		return get_combination_count(stock_count-100)+get_combination_count(stock_count-200);
		
//		 int n= stock_count/100;
//		 if (n<=2) {
//			return n;
//		}
//		 int a=1;
//		 int b=2;
//		 int sum=3;
//		 for (int i = 3; i <= n; i++) {
//			sum=a+b;
//			a=b;
//			b=sum;
//		}
//		
//		return sum;
	 }

}
