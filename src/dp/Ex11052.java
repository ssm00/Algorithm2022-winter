package dp;
// 카드구매하기
import java.util.Scanner;

public class Ex11052 {
	public static void main(String[] args) {
		// 1장인 패키지를 구매후 i-1장 구매
		// 2장인 패키지를 구매후 i-2장 구매
		// 3장인 패키지를 구매후 i-3장 구매
		//점화식 d[n] = d[n] + p[i-n]	
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d[] = new int[n+1]; 
		int arr [] = new int[n+1];		
		
		for(int i=1;i<=n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=1;i<=n; i++) {
			d[i] = arr[i];
			for(int j=1; j<=i; j++) {
				d[i] = Math.min(d[i], d[i-j]+arr[j]);
			}
		}
		
		System.out.println(d[n]);
		
	}

}
