package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllCellsDistOrder {
	public static void main(String[] args) {
		int R = 2;
		int C = 2;
		int r0=0;
		int c0=1;
		int k=0;
		int[][] t=new int[R*C][2];
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				t[k][0]=i;
				t[k][1] = j;
				k++;
			}
		}
		Arrays.sort(t,(o1,o2) -> Math.abs(o1[0]-r0)+Math.abs(o1[1]-c0)-Math.abs(o2[0]-r0)-Math.abs(o2[1]-c0));
		
		
//		int dist=0;
//		int count=0;
//		while(count<R*C) {
//			for (int i = 0; i <= dist; i++) {
//				int y = dist-i;
//				for (int j = 0; j < 2; j++) {
//					int ri;
//					if (j==0)  ri = r0+i;
//					else ri=r0-i;
//					if (ri<R&&ri>=0) {
//						for (int k = 0; k < 2; k++) {
//							int ry;
//							if (k==0)  ry = c0+y;
//							else ry=c0-y;
//							if (ry<C&&ry>=0) {
//								t[count] = new int[]{ri,ry};
//								count++;
//							}
//							if(y==0) break;
//						}
//					}
//					if(i==0) break;
//					
//				}
//			}
//			dist++;
//		}
////		return t;
				
	}
	
}
