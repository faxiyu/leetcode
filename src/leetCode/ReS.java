package leetCode;
/**
 * ����һ���ǿյ��ַ������ж����Ƿ����������һ���Ӵ��ظ���ι��ɡ��������ַ���ֻ����СдӢ����ĸ�����ҳ��Ȳ�����10000��
 * ����: "abab"
 * ���: True
 * ����: �������ַ��� "ab" �ظ����ι��ɡ�
 * @author 14257
 *
 */


public class ReS {
	public static void main(String[] args) {
		String s = "abababc";
		char[] c = s.toCharArray();
		if (c.length==1) {
			System.out.println("error");
			return ;
		}
		int k=0;
		for (int i = 0; i <c.length ; i++) {
			int b=i;
			for (int j = 0; j <= k; j++) {
				System.out.println(b+"  "+j);
				if (c[b]!=c[j]) {
					k=i;
					System.out.println(k);
					break;
				}
				if (b==c.length-1 && j==k) {
					System.out.println("right");
					return;
				}else if(b==c.length-1) {
					break;
				}else if(j==k) {
					j=-1;
				}
				b++;
			}
			
		}
		System.out.println("error");
		return ;
	}
}	
