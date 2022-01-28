package math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 에라토스테네스의 채 n이 100이면 그사이의 소수를모두구하기
// 외우기
public class Ex1929 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		
		//에리토스테네스의 채구현
		boolean prime [] = new boolean[m+1]; //false가 소수
		
		
		prime[0] = prime[1] = true; 
		for(int i=2; i*i<=m; i++) {
			if(!prime[i]) {
				for(int j=i*i; j<=m; j+=i) {
					prime[j] = true;		//배수들을 지움
				}
			}
		}
		
		for(int i=n; i<=m; i++) {
			if(!prime[i]) {
				bw.write(String.valueOf(i)+"\n");
			}
		}
		
		bw.flush();
		bw.close();
	}
}
