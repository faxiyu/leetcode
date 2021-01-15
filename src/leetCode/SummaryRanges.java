package leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ�����ظ�Ԫ�ص������������� nums ��
���� ǡ�ø����������������� �� ��С���� ���䷶Χ�б�Ҳ����˵��nums ��ÿ��Ԫ�ض�ǡ�ñ�ĳ�����䷶Χ�����ǣ�
���Ҳ���������ĳ����Χ�������� nums ������ x ��
�б��е�ÿ�����䷶Χ [a,b] Ӧ�ð����¸�ʽ�����
"a->b" ����� a != b
"a" ����� a == b
 * @author 14257
 *
 */
public class SummaryRanges {
	public static void main(String[] args) {
		int[] nums = {0,1,2,4,5,7};
		List<String> strings = new ArrayList<>();
		if (nums.length==0) {
//			return strings; 
		}
		int min = nums[0];
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i]==max+1) {
				max++;
			}else {
				if (min==max) {
					strings.add(""+min);
				}else {
					strings.add(min+"->"+max);
				}
				min=max=nums[i];
			}
		}
		if (min==max) {
			strings.add(""+min);
		}else {
			strings.add(min+"->"+max);
		}
		System.out.println(strings);
	}
}
