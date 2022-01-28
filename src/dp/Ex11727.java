package dp;

import java.util.Scanner;
// 2n도형
public class Ex11727 {
	
	static int d [] = new int[1001];
	static int dp(int n) {
		if(n==1) {
			return 1;
		}if(n==2) {
			return 3;
		}if(d[n] != 0) {
			return d[n];
		} d[n] = (dp(n-1)+2*dp(n-2)) % 10007;
		return d[n] % 10007;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(dp(x));
		
	}
}	
