package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ���������� 0 �� 1 ��ɵ����� A�����Ƕ��� N_i���� A[0] �� A[i] �ĵ� i �������鱻����Ϊһ�������������������Чλ�������Чλ����
���ز���ֵ�б� answer��ֻ�е� N_i ���Ա� 5 ����ʱ���� answer[i] Ϊ true������Ϊ false��
 * @author 14257
 *
 */
public class prefixesDivBy5 {

	public static void main(String[] args) {
		int[] A = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
		List<Boolean> list = new ArrayList<>();
		
		int sum=0;
		for (int i :A) {
			sum=((sum<<1)+i)%5;
			list.add(sum==0);
		}
		System.out.println(list);

	}

}
