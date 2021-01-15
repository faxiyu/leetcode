package leetCode;
/**
 * ÊÖ»ú¼üÅÌÊäÈë
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tele {
	static List<String> list = new ArrayList<>();
	static StringBuilder a=new StringBuilder(); 
	public static void main(String[] args) {
		String digits ="3";
		if (digits==null || "".equals(digits)) {
			list.clear();;
			System.out.println(list);
		}
		Map<Character, String> map = new HashMap<>();
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz");
		String[] s = new String[digits.length()];
		for (int i = 0; i < digits.length(); i++) {
			s[i] = map.get(digits.charAt(i));
		}
		
		xun(0, digits.length(),s);
		System.out.println(list);
	}
	public static void xun(int count,int length, String[] s) {
		if (count==length) {
			list.add(a.toString());
			return ;
		}
		for (int i = 0; i < s[count].length(); i++) {
			a.append(s[count].charAt(i));
			xun(count+1, length, s);
			a.deleteCharAt(count);
		}
	}
}
