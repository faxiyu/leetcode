package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * �����д���˳���һȺ��վ��һ�����С� 
 * ÿ������һ��������(h, k)��ʾ������h������˵���ߣ�k�����������ǰ������ߴ��ڻ����h��������
 *  ��дһ���㷨���ؽ�������С�
 * @author 14257
 *
 */
public class ReconstructQueue {
	public static void main(String[] args) {
		int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		Arrays.sort(people,(o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
		List<int[]> list = new ArrayList<>();
        for (int[] i : people) {
            list.add(i[1], i);
        }
        int[][] array = list.toArray(new int[list.size()][2]);
        
	}
}
