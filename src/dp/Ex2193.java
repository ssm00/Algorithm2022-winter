package dp;
//이친수

import java.util.Scanner;

public class Ex2193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long d[][] = new long [91][2]; // 90을 넣으면 값이 커서 -값을 반환하므로 배열을 long으로 넣어야함
		
		d[1][0] = 0; // 길이가 1인데 맨끝 0 그런거 없음  
		d[1][1] = 1; // 길이가 1인데 맨끝 1 (1) 한개 
		d[0][0] = 0;
		d[2][0] = 1; // 1,0 1개
		d[2][1] = 0; // 없음
		
		for(int n=3; n<=90; n++) {
			d[n][1] = d[n-1][0];
			d[n][0] = d[n-1][1] + d[n-1][0];	
		}
		
		int n = sc.nextInt();
		
		System.out.println(d[n][1]+d[n][0]);
		
	}
}
