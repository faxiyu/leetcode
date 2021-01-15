package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。 给定一个整数 n，返回所有不同的 n
 * 皇后问题的解决方案。 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 *  输入：4 
 *  输出：[
 * [".Q..", // 解法 1 
 *  "...Q", "Q...", 
 *  "..Q."], 
 * ["..Q.", // 解法 2 
 *  "Q...", 
 *  "...Q",
 *  ".Q.."] ]
 * @author 14257
 *
 */
public class SolveNQueens {
	public static void main(String[] args) {
		int n = 4;
		List<List<String>> solutions = new ArrayList<List<String>>();
		int[] queens = new int[n];
		Arrays.fill(queens, -1);
	
		//分别记录每一列以及两个方向的每条斜线上是否有皇后
		Set<Integer> columns = new HashSet<Integer>();
		Set<Integer> diagonals1 = new HashSet<Integer>();
		Set<Integer> diagonals2 = new HashSet<Integer>();
		
		backtrack(solutions, queens, n, 0, columns, diagonals1, diagonals2);
		System.out.println(solutions);
	}

	private static void backtrack(List<List<String>> solutions, int[] queens, int n, int row, Set<Integer> columns,
			Set<Integer> diagonals1, Set<Integer> diagonals2) {
		if (row == n) {
			List<String> board = generateBoard(queens, n);
			System.out.println(diagonals1);
			solutions.add(board);
		} else {
			for (int i = 0; i < n; i++) {
				if (columns.contains(i)) {
					continue;
				}
				int diagonal1 = row - i;
				if (diagonals1.contains(diagonal1)) {
					continue;
				}
				int diagonal2 = row + i;
				if (diagonals2.contains(diagonal2)) {
					continue;
				}
				queens[row] = i;
				columns.add(i);
				
				diagonals1.add(diagonal1);
				diagonals2.add(diagonal2);
				backtrack(solutions, queens, n, row + 1, columns, diagonals1, diagonals2);
				queens[row] = -1;
				columns.remove(i);
				diagonals1.remove(diagonal1);
				diagonals2.remove(diagonal2);
			}
		}
	}

	public static List<String> generateBoard(int[] queens, int n) {
		List<String> board = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			char[] row = new char[n];
			Arrays.fill(row, '.');
			row[queens[i]] = 'Q';
			board.add(new String(row));
		}
		return board;
	}
}
