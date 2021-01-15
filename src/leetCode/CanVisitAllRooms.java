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
 * 有 N 个房间，开始时你位于 0 号房间。每个房间有不同的号码：0，1，2，...，N-1，并且房间里可能有一些钥匙能使你进入下一个房间。
 * 在形式上，对于每个房间 i 都有一个钥匙列表 rooms[i]，每个钥匙 rooms[i][j] 由 [0,1，...，N-1] 中的一个整数表示，其中 N = rooms.length。 钥匙 rooms[i][j] = v 可以打开编号为 v 的房间。
 * 最初，除 0 号房间外的其余所有房间都被锁住。你可以自由地在房间之间来回走动。
 * 如果能进入每个房间返回 true，否则返回 false。
 * 输入: [[1],[2],[3],[]]
 * 输出: true
 * 解释:
 * 我们从 0 号房间开始，拿到钥匙 1。
 * 之后我们去 1 号房间，拿到钥匙 2。
 * 然后我们去 2 号房间，拿到钥匙 3。
 * 最后我们去了 3 号房间。
 * 由于我们能够进入每个房间，我们返回 true。
 * 输入：[[1,3],[3,0,1],[2],[0]]
 * 输出：false
 * 解释：我们不能进入 2 号房间。
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
