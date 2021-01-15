package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * �����������ʣ�beginWord �� endWord����һ���ֵ䣬�ҵ��� beginWord �� endWord �����ת�����еĳ��ȡ�
 * ˫���������㷨
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

		// �� 2 �����Ѿ����ʹ��� word ��ӵ� visited ��ϣ����
		Set<String> visited = new HashSet<>();
		// �ֱ�����ߺ��ұ���ɢ�Ĺ�ϣ����浥�� BFS ��Ķ��У�������˫�� BFS �Ĺ����н���ʹ��
		Set<String> beginVisited = new HashSet<>();
		beginVisited.add(beginWord);
		Set<String> endVisited = new HashSet<>();
		endVisited.add(endWord);

		// �� 3 ����ִ��˫�� BFS�����ҽ�����ɢ�Ĳ���֮��Ϊ����
		int step = 1;
		while (!beginVisited.isEmpty() && !endVisited.isEmpty()) {
			// ����ѡ��С�Ĺ�ϣ�������ɢ�����ǵ����������
			if (beginVisited.size() > endVisited.size()) {
				Set<String> temp = beginVisited;
				beginVisited = endVisited;
				endVisited = temp;
			}

			// �߼��������֤ beginVisited ����Խ�С�ļ��ϣ�nextLevelVisited ����ɢ����Ժ󣬻��Ϊ�µ� beginVisited
			Set<String> nextLevelVisited = new HashSet<>();
			for (String word : beginVisited) {
				if (changeWordEveryOneLetter(word, endVisited, visited, wordSet, nextLevelVisited)) {
					System.out.println(step + 1);
					return;
				}
			}

			// ԭ���� beginVisited �������� nextLevelVisited ��ʼ�µ�˫�� BFS
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
			// �ָ����´�����
			charArray[i] = originChar;
		}
		return false;
	}
}
