package leetCode;

import java.util.Arrays;

/**
 * �ڱ�������, ��ָ����һ����ͨ���޻�������ͼ��
����һ��ͼ����ͼ��һ������N���ڵ� (�ڵ�ֵ���ظ�1, 2, ..., N) ������һ�����ӵı߹��ɡ�
���ӵıߵ��������������1��N�м䣬�������ӵı߲����������Ѵ��ڵıߡ�
���ͼ��һ���Ա���ɵĶ�ά���顣ÿһ���ߵ�Ԫ����һ��[u, v] ������ u < v����ʾ���Ӷ���u ��v������ͼ�ıߡ�
����һ������ɾȥ�ıߣ�ʹ�ý��ͼ��һ������N���ڵ����������ж���𰸣��򷵻ض�ά�����������ֵıߡ��𰸱� [u, v] Ӧ������ͬ�ĸ�ʽ u < v��
 * @author 14257
 *���鼯
 */
public class FindRedundantConnection {
	public static void main(String[] args) {
		int[][] edges = {{1,2},{1,3},{2,3}};
		int nodesCount = edges.length;
        int[] parent = new int[nodesCount + 1];
        for (int i = 1; i <= nodesCount; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < nodesCount; i++) {
            int[] edge = edges[i];
            int node1 = edge[0], node2 = edge[1];
            //���ж����������ӵ����������Ƿ�������ͬ����ͨ������
            if (find(parent, node1) != find(parent, node2)) {
                union(parent, node1, node2);
            } else {
//                return edge;
            	System.out.println(Arrays.toString(edge));
            }
        }
//        return new int[0];
    }
	//�ϲ��������������ͨ����
    public static void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
        System.out.println("parent"+Arrays.toString(parent));
    }
    //���Ҹ��ڵ�
    public static int find(int[] parent, int index) {
        if (parent[index] != index) {
            parent[index] = find(parent, parent[index]);
        }
        return parent[index];
    
	}
}
