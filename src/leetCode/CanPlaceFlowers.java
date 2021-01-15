package leetCode;
/**
 * 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 * 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。
 * 能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
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
