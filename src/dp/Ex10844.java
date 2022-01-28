package dp;

import java.util.Scanner;

//쉬운계단수
public class Ex10844 {
	public static void main(String[] args) {
		long d[][] = new long[101][10];
		for (int i = 1; i <= 9; i++) {
			d[1][i] = 1;
		}

		for (int n = 2; n <= 100; n++) {
			for (int i = 0; i <= 9; i++) {
				d[n][i] = 0;
				if (i-1 >= 0) {
					d[n][i] += d[n - 1][i - 1] % 1000000000;
				}if(i+1 <= 9) {	
					d[n][i] += d[n - 1][i + 1] % 1000000000;	
				}
			}
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long result = 0;
		for (int i = 0; i <= 9; i++) {
			result += d[n][i] % 1000000000;
		}
		System.out.println(result % 1000000000);

	}
}
