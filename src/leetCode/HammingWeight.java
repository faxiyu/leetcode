package leetCode;

public class HammingWeight {
	public static void main(String[] args) {
		int n=00000000000000000000000000001011;
		System.out.println(n);
		String string=Integer.toBinaryString(n);
		int sum=0;
		int indexOf=-1;
		for(;;) {
			indexOf = string.indexOf("1", indexOf+1);
			if (indexOf!=-1) {
				sum++;
			}else {
				break;
			}
		}
		System.out.println(sum);
	}
}
