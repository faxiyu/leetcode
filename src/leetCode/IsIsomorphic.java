package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * ���������ַ��� s �� t���ж������Ƿ���ͬ���ġ�
 * ��� s �е��ַ����Ա��滻�õ� t ����ô�������ַ�����ͬ���ġ�
 * ���г��ֵ��ַ�����������һ���ַ��滻��ͬʱ�����ַ���˳�������ַ�����ӳ�䵽ͬһ���ַ��ϣ����ַ�����ӳ���Լ�
 *  * @author 14257
 *
 */
public class IsIsomorphic {
	public static void main(String[] args) {
		String s = "egg";
		String t = "add";
		Map<Character, Character> map = new HashMap<>();
		Map<Character, Character> zmap = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char key = s.charAt(i);
			char value=t.charAt(i);
			if (!map.containsKey(key)) {
				map.put(key, value);
			}
			if (!zmap.containsKey(value)) {
				zmap.put(value, key);
			}
			if (map.get(key)!=value||zmap.get(value)!=key) {
//				return false;
			}
			
		}
		System.out.println(true);
	}
}
