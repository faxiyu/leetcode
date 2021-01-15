package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 给你一个用字符数组 tasks 表示的 CPU 需要执行的任务列表。其中每个字母表示一种不同种类的任务。
 * 任务可以以任意顺序执行，并且每个任务都可以在 1 个单位时间内执行完。
 * 在任何一个单位时间，CPU 可以完成一个任务，或者处于待命状态。
 * 然而，两个 相同种类 的任务之间必须有长度为整数 n 的冷却时间，
 * 因此至少有连续 n 个单位时间内 CPU 在执行不同的任务，或者在待命状态。
 * 你需要计算完成所有任务所需要的 最短时间 。
 * @author 14257
 *
 */
public class LeastInterval {
	public static void main(String[] args) {
		char[] tasks = {'A','B','A','B','A','B','C','D','A','A','A','G'};
		int n=2;
		int[] chars = new int[26];
		for (char c : tasks) {
			chars[c-'A']++;
		}
		Arrays.sort(chars);
		int length=0;
		while(true) {
			int count=0;
			for (int i = 25; i >=0&&count<n+1; i--) {
				if (chars[i]==0) {
					break;
				}else {
					chars[i]--;
					count++;
				}
			}
			Arrays.sort(chars);
			if (chars[25]==0) {
				length+=count;
				break;
			}else {
				length+=n+1;
			}
			
		}
		System.out.println(length);
				
	}
	
}
