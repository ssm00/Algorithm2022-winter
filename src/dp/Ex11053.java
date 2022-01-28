package dp;
//가장긴 증가하는 부분 수열
import java.util.Scanner;

public class Ex11053 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[1001];
		int d [] = new int[1001];
		
		int n = sc.nextInt();
		sc.nextLine();
		String temp [] = new String[n];
		temp = sc.nextLine().split(" ");
		
		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(temp[i-1]);
		}
		
		for(int i=1; i<=n; i++) {
			d[i] = 1 ;
			for(int j=1; j<i; j++) {
				if(arr[i]>arr[j] && d[i] == d[j]) {
					d[i] = d[j]+1;
				}
			}	
		}
		
		int max = 1;
		for(int i=1; i<=n; i++) {
			max = Math.max(max, d[i]);
		}
		
		System.out.println(max);
		
	}

}
