package leetCode;
/**
 * ��һ����ά���� A ����ÿ��Ԫ�ص�ֵΪ 0 �� 1 ��
�ƶ���ָѡ����һ�л��У���ת�����л����е�ÿһ��ֵ�������� 0 ������Ϊ 1�������� 1 ������Ϊ 0��
����������������ƶ��󣬽��þ����ÿһ�ж����ն������������ͣ�����ĵ÷־�����Щ���ֵ��ܺ͡�
���ؾ����ܸߵķ�����
 * @author 14257
 *
 */
public class MatrixScore {
	public static void main(String[] args) {
		int[][] A= {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
		for (int i = 0; i < A[0].length; i++) {
			int count=0;
			for (int j = 0; j < A.length; j++) {
				if (i==0&&A[j][i]==0) {
					for (int k = 0; k < A[0].length; k++) 
						A[j][k]=(A[j][k]+1)%2;
				}
				if (i>0) {
					if (A[j][i]==0) count--;
					else count++;
				}
			}
			if(count<0){
				for (int j = 0; j < A.length; j++) 
					A[j][i]=(A[j][i]+1)%2;
			}
		}
		int sum=0;
		for (int i = 0; i < A.length; i++) {
			sum+=tovalue(A[i]);
		}
		System.out.println(sum);
	}

	private static int tovalue(int[] is) {
		int num = is.length-1;
		int value=0;
		for (int i = num; i >=0; i--) {
			value+=is[i]*Math.pow(2,num-i);
		}
		return value;
	}
}
