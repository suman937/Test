/*
 * create a pattern upright pyramid of astricks
 */

// line added for commit
package com.patterns;

public class Main {

	public static void main(String[] args) {
		
//		pattern1(5);
//		pattern8(5);
//		pattern2(5);
//		pattern9(5);
//		
//		pattern4(5);
//		pattern7(5);
//		pattern3(5);
		pattern10(6);

	}
	
	
	static void pattern4(int n) {
		for(int i=1; i<=2*n;i++) {
			int totalColsInRow = i>n ?2*n -i:i; //we can use ternary operator
			int spaces = n - totalColsInRow;
			for(int s =1; s<=spaces; s++) {System.out.print(" ");}
			for(int j=1; j<=totalColsInRow; j++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
	}
	
	
	
	static void pattern1(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	
	static void pattern2(int n) {
		for(int i=0; i<=n;i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	
	static void pattern3(int n) {
		for(int i=1; i<=n;i++) {
			int spaces = n - i;
			for(int s =1; s<=spaces; s++) {System.out.print(" ");}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	
	static void pattern5(int n) {
		for(int i =1; i<=2*n-1;i++){
			
			int columnNum = i>n ? 2*n -i :i;
			int spaces = n-columnNum;
			for(int s=0; s<spaces;s++) {System.out.print(" ");}
			for(int j=1; j<=columnNum; j++) {
				//System.out.print(i+" ");
				System.out.print("* ");
			}
			
		System.out.println();
		}
	}

	static void pattern6(int n) {
		for(int row=1; row<=2*n-1; row++) {
			int colnum = row>n?2*n-row:row;
			int spaces = n-colnum;
			for(int s=0; s<spaces;s++) {System.out.print("  ");}
			
			for(int col=colnum; col>=1;col--) {
				System.out.print(col+" ");
			}
			for(int col=2;col<=colnum;col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	static void pattern7(int n) {
		for(int row =1; row<2*n; row++) {
			
			int c = row>n?2*n-row: row;
			int s = row>n?n-1:n-c;		
			for(int space=0;space<s;space++) {System.out.print("  ");}
			for(int col=1; col<=c; col++) {
				System.out.print("* ");
			}
			
			
			if(row==n) {
				for(int col=n+1; col<=2*n-1; col++) {
					System.out.print("* ");
				}
				
				
			}
			
				System.out.println();
		}
			
	}
	
	static void pattern8(int n) {
		for (int row = 1; row <= 2 * n - 1; row++) {
			int c = row > n ? 2 * n - row : row;
			int s = n - c; // alwyas use c to calculate s if possible
			for (int space = 0; space < s; space++) {
				System.out.print(" ");
			}

			for (int col = c; col >= 1; col--) {

				System.out.print(col);
			}
			for (int col = 2; col <= c; col++) {
				System.out.print(col);
			}

			System.out.println();
		}
	}

	static void pattern9(int n) {
		n = n - 1;
		n = 2 * n;

		for (int row = 0; row <= n; row++) {

			for (int col = 0; col <= n; col++) {
				int atEveryIndex = n / 2 - Math.min(Math.min(row, col), Math.min(n - row, n - col)) + 1;
				System.out.print(atEveryIndex + " ");
			}
			System.out.println();
		}
	}
	
	
	
	static void pattern10(int n) {
		for(int row =1; row<2*n; row++) {
			
			int c = row>n?2*n-row: row; // i haven't mention how many columns when row=n
			int s = row>n?n-1:n-c;		// here also haven't mentioned how many space when row =n
			// meaning I have to separately mentioned for the condition row=n for both column number and no.of space.
			
			for(int space=0;space<s;space++) {System.out.print("  ");}
			
			// range of this loop should always be ranges in terms of n. because we cannot c and s when row==n
			// we have not measured c or s when row==n. so it always has to iterate in terms of n.
			if(row==n) {
				for(int col=n+1; col<=2*n-1; col++) {
					System.out.print("* ");
				}
				
				
			}
			// this is responsible to produce from 1 to c=6. when row=6 c=6 and n=6. meaning on row=6 line
			// below loop will print 1-6 included total 6 * but we need another 5 more * when row==n.
			//
			for(int col=1; col<=c; col++) {
				System.out.print("* ");
			}
			
			
			
			
				System.out.println();
		}
			
	}
	
	

	
	}
	


