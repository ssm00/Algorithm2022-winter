package dp;

import java.util.Scanner;

public class Ex9095 {
	static int d[] = new int [12]; 
	static int dp(int n) {
		
		if(n == 1) {
			return 1;
		}if(n == 2) {
			return 2;
		}if(n ==3) {
			return 4;
		}if(d[n] != 0) {
			return d[n];
		}
		return d[n] = dp(n-1)+dp(n-2)+dp(n-3);
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		while(cnt-- > 0) {
			int x = sc.nextInt();
			System.out.println(dp(x));
		}
		
	}
}
