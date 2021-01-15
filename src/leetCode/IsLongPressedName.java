package leetCode;

public class IsLongPressedName {
	public static void main(String[] args) {
		String name = "laiden";
		String typed = "laidena";
		int k=0;
		int a=0;
		for(;;) {
			int sum=0;
			int cum=0;
			char c=' ';
			for (int i = a; i < name.length()-1; i++) {
				c = name.charAt(i);
				a++;
				sum++;
				if (name.charAt(i+1)!=c) {
					break;
				}else if(i+1==name.length()-1) {
					a++;
					sum++;
				}	
			}
			if (a==name.length()-1&&c==' ') {
				c=name.charAt(name.length()-1);
				a++;
				sum++;
			}
			for (int j = k; j < typed.length(); j++) {
				if (typed.charAt(j)==c) {
					k++;
					cum++;
				}else break;
			}
			System.out.println(c+"  "+sum+" "+cum);
			if (cum<sum||(a==name.length()&&k<typed.length())) {
				System.out.println(false);
				return ;
			}
			if (a>=name.length())break;
		}
		System.out.println(true);
		return ;
	}
}
