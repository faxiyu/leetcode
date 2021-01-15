package leetCode;
/**
 * 数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
 * 请写一个函数，求任意第n位对应的数字。
 * @author 14257
 *
 */
public class FindNthDigit {
	public static void main(String[] args) {
		
		int n=11;
//        int digit = 1;
//        long start = 1;
//        long count = 9;
//        while (n > count) { 
//            n -= count;
//            digit += 1;
//            start *= 10;
//            count = digit * start * 9;
//        }
//        System.out.println(n);
//        long num = start + (n - 1) / digit; 
//        System.out.println(Long.toString(num).charAt((n - 1) % digit) - '0');
		
		int a=n;
		if (n<10) {
			System.out.println(n);
			return ;
		}
		int w=0;//位数
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			int nine = (int)Math.pow(10, i)*(i+1);
			if (n>9*nine) {
				n=n-9*nine;
				w++;
			}else {
				w++;
				break;
			}
		}
		System.out.println(n);
		long pow=(long)Math.pow(10, w);
		long num=pow+(n-1)/w;
		System.out.println(num);
		System.out.println(Long.toString(num).charAt((n - 1) % w) - '0');
		
		
		
//		long count=n/w-1;//w位数的第几个
//		if (a%2==0) {
//			count++;
//		}
//		int r=n%w;//第几个
//		long sum=(pow+count);
//		System.out.println(pow+"  "+count);
//		String s = ""+sum;
//		int num = Integer.valueOf(""+(s.charAt((r+w-1)%w)));
//		System.out.println("w:"+w+" c:"+count+"  r"+r+" s"+s);
//		System.out.println(num);
		
	}
}
