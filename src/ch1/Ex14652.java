package ch1;

import java.util.Scanner;

public class Ex14652 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		
		int b = k%m;
		int a = k/m;
		System.out.println(a+" "+b);
		
	}
}
