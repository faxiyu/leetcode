package leetCode;
/**
 * ��������һ���ܳ��Ļ�̳��һ���ֵؿ���ֲ�˻�����һ����ȴû�С����ǣ����ܲ�����ֲ�����ڵĵؿ��ϣ����ǻ�����ˮԴ�����߶�����ȥ��
 * ����һ����̳����ʾΪһ���������0��1������0��ʾû��ֲ����1��ʾ��ֲ�˻�������һ���� n ��
 * �ܷ��ڲ�������ֲ�������������� n �仨�����򷵻�True�������򷵻�False��
 * @author 14257
 *
 */
public class CanPlaceFlowers {
	public static void main(String[] args) {
		int[] flowerbed= {0};
		int n=1;
		int count=0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i]==0) {
				if (i==0) {
					if (flowerbed.length<2||flowerbed[1]==0) {
						flowerbed[0]=1;
						count++;
					}
					continue;
				}
				if (i==flowerbed.length-1) {
					if (flowerbed[i-1]==0) {
						count++;
					}
					continue;
				}
				if (flowerbed[i-1]==0&&flowerbed[i+1]==0) {
					count++;
					flowerbed[i]=1;
				}
				
			}
		}
		if (count>=n) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
