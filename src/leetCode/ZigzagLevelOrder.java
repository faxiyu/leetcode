package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ����һ����������������ڵ�ֵ�ľ���β�������������ȴ������ң��ٴ������������һ��������Դ����ƣ������֮�佻����У���
 * @author 14257
 *
 */
public class ZigzagLevelOrder {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left=new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		Map<Integer, List<Integer>> map = new HashMap<>();
		bianli(root,0,map);
		List<List<Integer>> lists =new ArrayList<>(map.values());
		for (int i = 1; i < lists.size(); i+=2) {
			List<Integer> list = lists.get(i);
			Object[] array = list.toArray();
			list.clear();
			for (int j = array.length-1; j >=0; j--) {
				list.add((Integer)array[j]);
			}
		}
		System.out.println(lists);
	}

	private static void bianli(TreeNode root,int num, Map<Integer, List<Integer>> map) {
		if (root==null) {
			return ;
		}
		List<Integer> orDefault = map.getOrDefault(num, new ArrayList<>());
		orDefault.add(root.val);
		map.put(num, orDefault);
		bianli(root.left, num+1,map);
		bianli(root.right, num+1,map);
		
	}
}
