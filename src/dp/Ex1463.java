package dp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

//1로 만들기
public class Ex1463 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int d[] = new int[n+1]; 
		d[1]=0;
		
		for(int i=2;i<=n;i++) {
			d[i] = d[i-1] +1;
			if(i%2 == 0 && d[i] > d[i/2] +1 ) {
				d[i] = d[i/2]+1;
			}
			if(i%3==0 && d[i] > d[i/3]+1) {
				d[i] = d[i/3]+1;
			}	
		}
		bw.write(String.valueOf(d[n]));
		bw.flush();
		bw.close();
	}
}
