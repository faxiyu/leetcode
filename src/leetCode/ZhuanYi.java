package leetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * 
 * C市现在要转移一批罪犯到D市，C市有n名罪犯，按照入狱时间有顺序，另外每个罪犯有一个罪行值，值越大罪越重。
 * 现在为了方便管理，市长决定转移入狱时间连续的c名犯人，同时要求转移犯人的罪行值之和不超过t，
 * 问有多少种选择的方式（一组测试用例可能包含多组数据，请注意处理）？ 
 * 第一行数据三个整数:n，t，c(1≤n≤2e5,0≤t≤1e9,1≤c≤n)，第二行按入狱时间给出每个犯人的罪行值a
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
		
		
//		String str="中国 aadf 的111萨 bbb 菲的 zz 萨菲";
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
//		String str="我ABC";
//		String str1="我ABC汉DEF";
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
//		 //对是否出现截半做分类处理，如果出现了截半情况，则asc码值小于0
//	       if(bytes[len]<0) {
//	           String result = new String(bytes,0, len--);
//	           System.out.println("出现了截半情况，结果为：" + result);
//	       } else {
//	          String result = new String(bytes,0,len);
//	          System.out.println("没有出现截半情况，结果为：" + result);
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
