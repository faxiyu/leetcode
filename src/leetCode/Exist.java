package leetCode;
/***
 * �����һ�������������ж���һ���������Ƿ����һ������ĳ�ַ��������ַ���·����
 * ·�����ԴӾ����е�����һ��ʼ��ÿһ�������ھ����������ҡ��ϡ����ƶ�һ�����һ��·�������˾����ĳһ����ô��·�������ٴν���ø��ӡ�
 * ���磬�������3��4�ľ����а���һ���ַ�����bfce����·����·���е���ĸ�üӴֱ����
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
