package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * ��һ����Сд��ĸ���ɵ��ַ��� s �У�������һЩ��������ͬ�ַ������ɵķ��顣
���磬���ַ��� s = "abbxxxxzyy" �У��ͺ��� "a", "bb", "xxxx", "z" �� "yy" ������һЩ���顣
������������� [start, end] ��ʾ������ start �� end �ֱ��ʾ�÷������ʼ����ֹλ�õ��±ꡣ�����е� "xxxx" �����������ʾΪ [3,6] ��
���ǳ����а������ڻ�������������ַ��ķ���Ϊ �ϴ���� ��
�ҵ�ÿһ�� �ϴ���� �����䣬����ʼλ���±����˳������󣬷��ؽ����
 * @author 14257
 *
 */
public class LargeGroupPositions {
	public static void main(String[] args) {
		String s ="aaa";
		int count=0;
		int start = 0;
		List<List<Integer>> lists = new ArrayList<>(); 
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i)==s.charAt(i-1)) {
				count++;
			}else {
				if (count>=2) {
					List<Integer> list = new ArrayList<>();
					list.add(start);
					list.add(i-1);
					lists.add(list);
				}
				start = i;
				count=0;
			}
			if (i==s.length()-1) {
				if (count>=2) {
					List<Integer> list = new ArrayList<>();
					list.add(start);
					list.add(i);
					lists.add(list);
				}
			}
		}
		System.out.println(lists.get(0));
	}
}
