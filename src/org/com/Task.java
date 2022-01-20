package org.com;

public class Task {

	public static void main(String[] args) {
		
		int a[] = new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		
		System.out.println(a[2]); 
		
		System.out.println("===============");
		
		int length = a.length;
		System.out.println(length);
		
		
		System.out.println("==============");
		//                     4
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("=============");
		//       2    1
		for (int x : a) {
			System.out.println(x);
		}
		
		System.out.println("=============");
		
		// a  10 20 30 40
		
		int b[][] = new int[2][2];
		// b  0    1  
		// 0  10   20
		// 1  30   40
		
		b[0][0] = 10;
		b[0][1] = 20;
		b[1][0] = 30;
		b[1][1] = 40;
		//      1          2          4
		for (int i = 0; i < b.length; i++) {//3
			      // 3.1     3.2          3.4
			for (int j = 0; j < b.length; j++) {//3.3
				System.out.println(b[i][j]);
			}
			
		}
		System.out.println("=======");
		
		for (int[] x : b) {
			
			for (int i : x) {
				System.out.println(i);
			}
			
		}
		
		
	} 
	
	
	
}
