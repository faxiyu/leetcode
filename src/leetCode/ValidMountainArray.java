package leetCode;

public class ValidMountainArray {

	public static void main(String[] args) {
		int[] A= { 0,3,2,1};
		int i=0;
		for (; i+1 < A.length;i ++) {
			if (A[i]<A[i+1]) {
				continue;
			}else {
				break;
			}
		}
		if (i==A.length-1||i==0) {
			System.out.println(false);
			return ;
		}
		for (; i+1 < A.length;i ++) {
			if (A[i]>A[i+1]) {
				continue;
			}else {
				break;
			}
		}
		if (i!=A.length-1) {
			System.out.println(false);
		}else {
			System.out.println(true);
		}

	}

}
