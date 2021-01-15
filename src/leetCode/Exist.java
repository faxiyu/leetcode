package leetCode;
/***
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
 * 例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）
 * @author 14257
 *
 */
public class Exist {
	public static void main(String[] args) {
		char[][] board= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word="ABCCED";
		int i=0;
		int j=0;
		for (i = 0; i < board.length; i++) {
			for (j = 0; j < board[0].length; j++) {
				if(dd(board, word, i, j, 0)) {
					System.out.println(true);
					return ;
				}
			}
		}
		System.out.println(false);
	}

	private static boolean dd(char[][] board, String word,int i,int j,int index) {
		if (i<0||j<0||i>=board.length||j>board[0].length||word.charAt(index)!=board[i][j]) {
			return false;
		}
		if (index==word.length()-1) {
			return true;
		}
		char temp=board[i][j];
		board[i][j]='/';
		boolean b=dd(board, word, i+1, j, index+1)||dd(board, word, i-1, j, index+1)||dd(board, word, i, j+1, index+1)||dd(board, word, i, j-1, index+1);
		board[i][j]=temp;
		return b;
		
	}
}
