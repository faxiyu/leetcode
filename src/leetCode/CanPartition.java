package leetCode;

/**
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * @author 14257
 *
 */
public class CanPartition {
	public static void main(String[] args) {
		int[] nums= {1,5,11,5};
		int n = nums.length;
        if (n < 2) {
            System.out.println(false);
            return ;
        }
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 != 0) {
            System.out.println(false);
            return ;
        }
        int target = sum / 2;
        if (maxNum > target) {
            System.out.println(false);
            return ;
        }
        boolean[][] dp = new boolean[n][target + 1];
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }
        dp[0][nums[0]] = true;
        for (int i = 1; i < n; i++) {
            int num = nums[i];
            for (int j = 1; j <= target; j++) {
                if (j >= num) {
                    dp[i][j] = dp[i - 1][j] | dp[i - 1][j - num];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        System.out.println(dp[n - 1][target]); 
        return ;
    }
}
