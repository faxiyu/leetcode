package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * C������Ҫת��һ���ﷸ��D�У�C����n���ﷸ����������ʱ����˳������ÿ���ﷸ��һ������ֵ��ֵԽ����Խ�ء�
 * ����Ϊ�˷�������г�����ת������ʱ��������c�����ˣ�ͬʱҪ��ת�Ʒ��˵�����ֵ֮�Ͳ�����t��
 * ���ж�����ѡ��ķ�ʽ��һ������������ܰ����������ݣ���ע�⴦���� 
 * ��һ��������������:n��t��c(1��n��2e5,0��t��1e9,1��c��n)���ڶ��а�����ʱ�����ÿ�����˵�����ֵa
 * @author 14257
 *
 */
public class ZhuanYi {
	public static void main(String[] args) {
		
		char[] chars={'1','3','3'};
		System.out.println(method(chars));
	}
	
	public static boolean method(char [] chars){
		boolean flag=true;
		String str =new String(chars);
		StringBuffer sb=new StringBuffer();
//		for(int i=0;i<chars.length;i++){
//			sb.insert(0, chars[i]);
//		}
//		String str=sb.toString();

		System.out.println(str);
		for(int i=0;i<str.length();i++){
			if(i!=str.lastIndexOf(str.charAt(i))){
				flag=false;
			}
		}
		return flag;
		
		
//		String str="�й� aadf ��111�� bbb �Ƶ� zz ����";
//		Map<String, Integer> map = method(str);
//		Set<Entry<String,Integer>> set=map.entrySet();
//		for(Entry<String,Integer> e:set){
//			System.out.println(e.getKey()+":"+e.getValue());
//		}
//	}
//	public static Map<String,Integer> method(String str){
//		Map<String,Integer> map=new HashMap<>();
//		for(int i=0;i<str.length();i++){
//			char c=str.charAt(i);
//			Integer num=map.get(String.valueOf(c));
//			if(num==null){
//				num=1;
//			}else{
//				num=num+1;
//			}
//			map.put(String.valueOf(c), num);
//		}
//		return map;

		
		//		int[] a= {1,2,3,4};
//		int[] b=a.clone();
//		a[1]=100;
//		System.out.println(b==a);
//		
//		String str="��ABC";
//		String str1="��ABC��DEF";
//		subStringByBytes(str, 4);
//		subStringByBytes(str1, 6);
//		int c=8;
//		System.out.println((c&(c-1))==0);
//	}
//	public static void subStringByBytes(String str,int len){
//		if(str==null){
//			return;
//		}
//		
//		if(len>str.length()){
//			len=str.length();
//		}
//		
//		byte [] bytes=str.getBytes();
//		
//		 //���Ƿ���ֽذ������ദ����������˽ذ��������asc��ֵС��0
//	       if(bytes[len]<0) {
//	           String result = new String(bytes,0, len--);
//	           System.out.println("�����˽ذ���������Ϊ��" + result);
//	       } else {
//	          String result = new String(bytes,0,len);
//	          System.out.println("û�г��ֽذ���������Ϊ��" + result);
//	       }
//	       
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int t = sc.nextInt();
//		int c = sc.nextInt();
//		int[] nums = new int[n];
//		int count=0;
//		int sum=0;
//		for (int i = 0; i < n; i++) {
//			nums[i] = sc.nextInt();
//		}
//		for (int i = 0; i < c; i++) {
//			sum+=nums[i];
//		}
//		if (sum<=t) {
//			count++;
//		}
//		for (int i = c; i < nums.length; i++) {
//			sum=sum+nums[i]-nums[i-c];
//			if (sum<=t) {
//				count++;
//			}
//		}
//		System.out.println(count);
	}
}
