package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * ����һ���ַ��� s���Լ����ַ����е�һЩ�������ԡ����� pairs������ pairs[i] = [a, b] ��ʾ�ַ����е�������������Ŵ� 0 ��ʼ����
 * ����� �����ν��� �� pairs ������һ�����������ַ��� �����ھ������ɴν�����s ���Ա�ɵİ��ֵ�����С���ַ�����
 * 
 * @author 14257
 *�鲢��
 */
public class SmallestStringWithSwaps {
	public static void main(String[] args) {
		String s = "dcab";
		List<List<Integer>> pairs = new ArrayList<>();
		List<Integer> pair = new ArrayList<>();
		pair.add(0);
		pair.add(3);
		List<Integer> pair1 = new ArrayList<>();
		pair1.add(1);
		pair1.add(2);
		List<Integer> pair2 = new ArrayList<>();
		pair2.add(0);
		pair2.add(2);
		pairs.add(pair);
		pairs.add(pair1);
		pairs.add(pair2);
		System.out.println(pairs);
		if (pairs.size() == 0) {
//	            return s;
		}

		// �� 1 ���������⽻���Ľ������벢�鼯
		int len = s.length();
		UnionFind unionFind = new UnionFind(len);
		for (List<Integer> pair3 : pairs) {
			int index1 = pair3.get(0);
			int index2 = pair3.get(1);
			unionFind.union(index1, index2);
		}

		// �� 2 ��������ӳ���ϵ
		char[] charArray = s.toCharArray();
		// key����ͨ�����Ĵ���Ԫ��value��ͬһ����ͨ�������ַ����ϣ�������һ�����ȶ����У�
		Map<Integer, PriorityQueue<Character>> hashMap = new HashMap<>(len);
		for (int i = 0; i < len; i++) {
			int root = unionFind.find(i);
			if (hashMap.containsKey(root)) {
				hashMap.get(root).offer(charArray[i]);
			} else {
				// PriorityQueue<Character> minHeap = new PriorityQueue<>();
				// minHeap.offer(charArray[i]);
				// hashMap.put(root, minHeap);
				// �������д���ȼ�������һ�д��룬JDK 1.8 �Լ��Ժ�֧�������д��
				hashMap.computeIfAbsent(root, key -> new PriorityQueue<>()).offer(charArray[i]);
			}
			System.out.println(hashMap);
		}

		// �� 3 ���������ַ���
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < len; i++) {
			int root = unionFind.find(i);
			stringBuilder.append(hashMap.get(root).poll());
		}
		System.out.println(stringBuilder.toString());
	}
	

	private static class UnionFind {

		private int[] parent;
		/**
		 * �� i Ϊ�����������ĸ߶ȣ�������·��ѹ���Ժ�ö��岢��׼ȷ��
		 */
		private int[] rank;

		public UnionFind(int n) {
			this.parent = new int[n];
			this.rank = new int[n];
			for (int i = 0; i < n; i++) {
				this.parent[i] = i;
				this.rank[i] = 1;
			}
		}

		public void union(int x, int y) {
			int rootX = find(x);
			int rootY = find(y);
			if (rootX == rootY) {
				return;
			}

			if (rank[rootX] == rank[rootY]) {
				parent[rootX] = rootY;
				// ��ʱ�� rootY Ϊ���������ĸ߶Ƚ����� 1
				rank[rootY]++;
			} else if (rank[rootX] < rank[rootY]) {
				parent[rootX] = rootY;
				// ��ʱ�� rootY Ϊ���������ĸ߶Ȳ���
			} else {
				// ͬ����ʱ�� rootX Ϊ���������ĸ߶Ȳ���
				parent[rootY] = rootX;
			}
		}

		public int find(int x) {
			if (x != parent[x]) {
				parent[x] = find(parent[x]);
			}
			return parent[x];
		}

	}
}
