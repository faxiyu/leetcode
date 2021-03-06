package leetCode;

import java.util.Arrays;

/**
 * 在本问题中, 树指的是一个连通且无环的无向图。
输入一个图，该图由一个有着N个节点 (节点值不重复1, 2, ..., N) 的树及一条附加的边构成。
附加的边的两个顶点包含在1到N中间，这条附加的边不属于树中已存在的边。
结果图是一个以边组成的二维数组。每一个边的元素是一对[u, v] ，满足 u < v，表示连接顶点u 和v的无向图的边。
返回一条可以删去的边，使得结果图是一个有着N个节点的树。如果有多个答案，则返回二维数组中最后出现的边。答案边 [u, v] 应满足相同的格式 u < v。
 * @author 14257
 *并查集
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
            //，判断这条边连接的两个顶点是否属于相同的连通分量。
            if (find(parent, node1) != find(parent, node2)) {
                union(parent, node1, node2);
            } else {
//                return edge;
            	System.out.println(Arrays.toString(edge));
            }
        }
//        return new int[0];
    }
	//合并这两个顶点的连通分量
    public static void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
        System.out.println("parent"+Arrays.toString(parent));
    }
    //查找根节点
    public static int find(int[] parent, int index) {
        if (parent[index] != index) {
            parent[index] = find(parent, parent[index]);
        }
        return parent[index];
    
	}
}
