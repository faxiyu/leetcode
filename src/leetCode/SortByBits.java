package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SortByBits   {
	public static void main(String[] args) {
		int[] arr = {1024,512,256,128,64,32,16,8,4,2,1};
		IntStream stream = Arrays.stream(arr);
		Stream<Integer> integerStream = stream.boxed();
		Integer[] integers = integerStream.toArray(Integer[]::new);
		Comparator cmp = new MyComparator();
        Arrays.sort(integers, cmp);
		System.out.println(Arrays.toString(arr));
	}
	
}
class MyComparator implements Comparator<Integer>{
    @Override
     public int compare(Integer o1, Integer o2) {
      int a = Integer.bitCount(o1)-Integer.bitCount(o2);  
      if (a==0) {
		a=o1-o2;
	}
      return a;
}

}