package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * n �ʺ������о�������ν� n ���ʺ������ n��n �������ϣ�����ʹ�ʺ�˴�֮�䲻���໥������ ����һ������ n���������в�ͬ�� n
 * �ʺ�����Ľ�������� ÿһ�ֽⷨ����һ����ȷ�� n �ʺ���������ӷ��÷������÷����� 'Q' �� '.' �ֱ�����˻ʺ�Ϳ�λ��
 *  ���룺4 
 *  �����[
 * [".Q..", // �ⷨ 1 
 *  "...Q", "Q...", 
 *  "..Q."], 
 * ["..Q.", // �ⷨ 2 
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
	
		//�ֱ��¼ÿһ���Լ����������ÿ��б�����Ƿ��лʺ�
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
