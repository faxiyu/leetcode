package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ����һ���ַ���S������Ƿ��������Ų����е���ĸ��ʹ�������ڵ��ַ���ͬ��
 * �����У����������еĽ�����������У����ؿ��ַ�����
 * @author 14257
 *
 */
public class ReorganizeString {
	public static void main(String[] args) {
		String s = "aabbcc";
		Map<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			map.put(c,map.getOrDefault(c, 0)+1);			
		} 
		
		String f = diedai(map,"",s.length());
		System.out.println(f);
	}

	private static String diedai(Map<Character, Integer> map, String s, int j) {
		if (s.length()==j) {
			return s;
		}
		Set<Character> keySet = map.keySet();
		for (Character c : keySet) {
			Integer i = map.get(c);
			if (i>0) {
				if (s.lastIndexOf(c)==-1||s.lastIndexOf(c)!=s.length()-1) {
					s+=c;
					map.put(c, map.get(c)-1);
					String f=diedai(map,s,j);
					if(f.length()==j) {
						return f; 
					}
					map.put(c, map.get(c)+1);
					s=s.substring(0, s.length()-1);
				}
			}
		}
		
		return "";
	}
}
