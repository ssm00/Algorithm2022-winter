package math1;
//소수 찾기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex1978 {
	
	static boolean pn(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2; i*i<=n; i++) {
			if(n % i == 0) {
				return false;	
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(br.readLine());
		
		String [] input = br.readLine().split(" ");
		int num =0;
		for(int i =0; i<cnt; i++) {
			if(pn(Integer.parseInt(input[i]))) {
				num++;
			}
		}
		bw.write(String.valueOf(num));
		bw.close();
	}
}
