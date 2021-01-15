package leetCode;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
	static List<String> word = new ArrayList<>();

	public static void main(String[] args) {
		String s = "pineapplepenapple";
		List<String> wordDict = new ArrayList<String>();
		wordDict.add("apple");
		wordDict.add("pen");
		wordDict.add("applepen");
		wordDict.add("pine");
		wordDict.add("pineapple");

		int len = s.length(), maxw = 0;
		boolean[] dp = new boolean[len + 1];
		dp[0] = true;
		for (String str : wordDict) {
			maxw = Math.max(maxw, str.length());
		}
		for (int i = 1; i < len + 1; i++) {
			for (int j = i; j >= 0 && j >= i - maxw; j--) {
				if (dp[j] && wordDict.indexOf(s.substring(j, i)) != -1) {
					dp[i] = true;
					break;
				}
			}
		}
		boolean b = dp[len];
		if (b) {
			zu(wordDict, s, "");			
		}
		System.out.println(word.toString());

	}

	private static void zu(List<String> wordDict, String s, String z) {
		String w = "";
		for (int i = 0; i < s.length(); i++) {
			w += s.charAt(i);
			if (wordDict.indexOf(w) != -1) {
				if (i == s.length() - 1) {
					z += w;
					word.add(z);
				}
				zu(wordDict, s.substring(i + 1), z + w + " ");
			}
		}

	}
}
