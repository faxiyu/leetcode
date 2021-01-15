package leetCode;
/**
 * 把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”：
 * B.length >= 3
 * 存在 0 < i < B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... > B[B.length - 1]
 * （注意：B 可以是 A 的任意子数组，包括整个数组 A。）
 * 给出一个整数数组 A，返回最长 “山脉” 的长度。
 * 如果不含有 “山脉” 则返回 0。
 * @author 14257
 *
 */
public class LongestMountain {
	public static void main(String[] args) {
		int[] A = {0,1,0};
		boolean b =true;
		int max=0;
		int sum=1;
		for (int i = 0; i < A.length-1; i++) {
			if (b) {
				if (A[i]<A[i+1]) sum++;
				else if(A[i]>A[i+1]&&sum>1){
					b=false;
					sum++;
					if (i==A.length-2) 	max=Math.max(max, sum);
				}else if(A[i]==A[i+1]) {
					max=Math.max(max, sum);
					sum=1;
				}
			}else {
				if (A[i]>A[i+1]) sum++;
				else if(A[i]<A[i+1]) {
					b=true;
					max=Math.max(max, sum);
					sum=2;
				}else {
					max=Math.max(max, sum);
					sum=1;
					b=true;
				}
				if (i==A.length-2) max=Math.max(max, sum);
			}
		}
		if (max<3) 	System.out.println(0);
		System.out.println(max);
	}
}
