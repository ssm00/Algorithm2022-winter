package dp;

import java.util.Scanner;

// 123 더하기 5 
public class Ex15990 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[][] d = new long[100001][4];
		d[1][1] = 1;
		d[2][2] = 1;
		d[3][1] = 1; //합이 3인것중에 맨끝이 1인것 (2,1) 1개
		d[3][2] = 1;
		d[3][3] = 1;

		for (int n = 4; n < 100001; n++) {
			d[n][1] = (d[n - 1][2] + d[n - 1][3]) % 1000000009; //끝이 1로 끝날때
			d[n][2] = (d[n - 2][1] + d[n - 2][3]) % 1000000009; //끝이 2로 끝날때
			d[n][3] = (d[n - 3][1] + d[n - 3][2]) % 1000000009; //끝이 3로 끝날때
		}

		int cnt = sc.nextInt();
		while (cnt-- > 0) {
			int n = sc.nextInt();
			System.out.println((d[n][1] + d[n][2] + d[n][3]) % 1000000009);	
		}
	}
}
