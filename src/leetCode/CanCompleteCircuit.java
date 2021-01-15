package leetCode;

public class CanCompleteCircuit {
	public static void main(String[] args) {
		int[] gas = {2,3,4};
		int[] cost = {3,4,3};
		for (int i = 0; i < cost.length; i++) {
			if (gas[i]<cost[i]) {
				continue;
			}else {
				boolean b = cirle(i,gas,cost);
				if (b) {
					System.out.println(i);
					return ;
				}
			}
		}
		System.out.println(-1);
	}

	private static boolean cirle(int i, int[] gas, int[] cost) {
		int count=gas[i];
		int start = i;
		i++;
		if (i==gas.length) {
			i=0;
		}
		int sum=0;
		int j=i-1;
		while(sum<gas.length) {
			if (i==start) return true;
			if (i==0) j=gas.length-1;
			else j=i-1;
			count+=gas[i]-cost[j];
			if (count<cost[i]) return false;
			if (i+1==gas.length) i=0;
			else i++;
		}
		return false;
	}
}
