package leetCode;
/**
 * ����һ������ n ����1��n��n��������ʮ���Ʊ�ʾ��1���ֵĴ�����
 * ����12��1��12��Щ�����а���1 ��������1��10��11��12��1һ��������5�Ρ�
 * @author 14257
 *
 */
public class CountDigitOne {

	public static void main(String[] args) {
		int n=452;
		
		//2
        int digit = 1, res = 0;
        int high = n / 10, cur = n % 10, low = 0;
        while(high != 0 || cur != 0) {
            if(cur == 0) res += high * digit;
            else if(cur == 1) res += high * digit + low + 1;
            else res += (high + 1) * digit;
            low += cur * digit;
            cur = high % 10;
            high /= 10;
            digit *= 10;
            //����185807 yao cheng jingzhen���  �칫��7956261  7956225
        }
        System.out.println(res);
        
		//1
//		int sum=0;
//		while(true) {
//			int a=0,count=1;
//			int pow=1;
//			for (int i = 1; i < 10; i++) {
//				pow=(int)Math.pow(10, i);
//				a=n/pow;
//				if (a<10) {
//					n=n%pow;
//					break;
//				}else count=(count*10)+pow;
//			}
//			sum+=count*a;
//			if (a>1) sum+=pow;
//			if (a==1) sum+=n+1;
//			if (n<10) {
//				if (n>=1) sum++;
//				break;
//			}
//		}
//		System.out.println(sum);

	}

}
