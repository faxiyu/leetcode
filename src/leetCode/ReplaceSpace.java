package leetCode;
/**
 * ��ʵ��һ�����������ַ��� s �е�ÿ���ո��滻��"%20"��
 * @author 14257
 *
 */
public class ReplaceSpace {

	public static void main(String[] args) {
		String s = "We are happy.";
		StringBuffer sb = new StringBuffer(s);
		for (;;) {
			int index = sb.indexOf(" ");
			if (index==-1) {
				break;
			}
			sb.replace(index, index+1, "%20");
			
		}
		System.out.println(sb.toString());

	}

}
