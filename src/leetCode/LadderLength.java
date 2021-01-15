package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord 的最短转换序列的长度。
 * 双向广度优先算法
 * @author 14257
 *
 */
public class LadderLength {
	public static void main(String[] args) {
		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = new ArrayList<>();
		wordList.add("hot");
		wordList.add("dot");
		wordList.add("dog");
		wordList.add("lot");
		wordList.add("log");
		wordList.add("cog");
		Set<String> wordSet = new HashSet<>(wordList);
		if (wordSet.size() == 0 || !wordSet.contains(endWord)) {
			System.out.println(0);
			return;
		}

		// 第 2 步：已经访问过的 word 添加到 visited 哈希表里
		Set<String> visited = new HashSet<>();
		// 分别用左边和右边扩散的哈希表代替单向 BFS 里的队列，它们在双向 BFS 的过程中交替使用
		Set<String> beginVisited = new HashSet<>();
		beginVisited.add(beginWord);
		Set<String> endVisited = new HashSet<>();
		endVisited.add(endWord);

		// 第 3 步：执行双向 BFS，左右交替扩散的步数之和为所求
		int step = 1;
		while (!beginVisited.isEmpty() && !endVisited.isEmpty()) {
			// 优先选择小的哈希表进行扩散，考虑到的情况更少
			if (beginVisited.size() > endVisited.size()) {
				Set<String> temp = beginVisited;
				beginVisited = endVisited;
				endVisited = temp;
			}

			// 逻辑到这里，保证 beginVisited 是相对较小的集合，nextLevelVisited 在扩散完成以后，会成为新的 beginVisited
			Set<String> nextLevelVisited = new HashSet<>();
			for (String word : beginVisited) {
				if (changeWordEveryOneLetter(word, endVisited, visited, wordSet, nextLevelVisited)) {
					System.out.println(step + 1);
					return;
				}
			}

			// 原来的 beginVisited 废弃，从 nextLevelVisited 开始新的双向 BFS
			beginVisited = nextLevelVisited;
			step++;
		}
		System.out.println(0);
		return;
	}

	private static boolean changeWordEveryOneLetter(String word, Set<String> endVisited, Set<String> visited,
			Set<String> wordSet, Set<String> nextLevelVisited) {
		char[] charArray = word.toCharArray();
		for (int i = 0; i < word.length(); i++) {
			char originChar = charArray[i];
			for (char c = 'a'; c <= 'z'; c++) {
				if (originChar == c) {
					continue;
				}
				charArray[i] = c;
				String nextWord = String.valueOf(charArray);
				if (wordSet.contains(nextWord)) {
					if (endVisited.contains(nextWord)) {
						return true;
					}
					if (!visited.contains(nextWord)) {
						nextLevelVisited.add(nextWord);
						visited.add(nextWord);
					}
				}
			}
			// 恢复，下次再用
			charArray[i] = originChar;
		}
		return false;
	}
}
