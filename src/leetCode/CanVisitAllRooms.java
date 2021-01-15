package leetCode;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * �� N �����䣬��ʼʱ��λ�� 0 �ŷ��䡣ÿ�������в�ͬ�ĺ��룺0��1��2��...��N-1�����ҷ����������һЩԿ����ʹ�������һ�����䡣
 * ����ʽ�ϣ�����ÿ������ i ����һ��Կ���б� rooms[i]��ÿ��Կ�� rooms[i][j] �� [0,1��...��N-1] �е�һ��������ʾ������ N = rooms.length�� Կ�� rooms[i][j] = v ���Դ򿪱��Ϊ v �ķ��䡣
 * ������� 0 �ŷ�������������з��䶼����ס����������ɵ��ڷ���֮�������߶���
 * ����ܽ���ÿ�����䷵�� true�����򷵻� false��
 * ����: [[1],[2],[3],[]]
 * ���: true
 * ����:
 * ���Ǵ� 0 �ŷ��俪ʼ���õ�Կ�� 1��
 * ֮������ȥ 1 �ŷ��䣬�õ�Կ�� 2��
 * Ȼ������ȥ 2 �ŷ��䣬�õ�Կ�� 3��
 * �������ȥ�� 3 �ŷ��䡣
 * ���������ܹ�����ÿ�����䣬���Ƿ��� true��
 * ���룺[[1,3],[3,0,1],[2],[0]]
 * �����false
 * ���ͣ����ǲ��ܽ��� 2 �ŷ��䡣
 *  @author 14257
 *
 */
public class CanVisitAllRooms {
	public static void main(String[] args) {
		List<List<Integer>> rooms = new ArrayList<>();
		rooms.add(Arrays.asList(1,3));
		rooms.add(Arrays.asList(3,0,1));
		rooms.add(Arrays.asList(2));
		rooms.add(Arrays.asList(0));
		System.out.println(rooms);
		
		List<Integer> lists = new ArrayList<>();
		lists.add(0);
		for (int i=0;i<lists.size();i++) {
			for (int j = 0; j < rooms.get(lists.get(i)).size(); j++) {
				if (! lists.contains(rooms.get(lists.get(i)).get(j))) {
					lists.add(rooms.get(lists.get(i)).get(j));					
				}
			}
			if (lists.size()==rooms.size()) {
				System.out.println("true");
				return ;
			}
		}
		if (lists.size()==rooms.size()) {
			System.out.println("true");
			return ;
		}else {
			System.out.println("false");
			return ;
		}
	}
}
