package math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;

//골드바흐의 추측 에라토스채 응용
public class Ex6588 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean prime [] = new boolean[1000001];		
		prime[0] = prime[1] = true;
		for(int i=2; i*i<=1000000; i++) {         //에라토스채 사용
			if(!prime[i]) {
				for(int j=i*i; j<=1000000; j+=i) {
					prime[j]= true;
				}
			}
		}
		
		
		while(true) {
			int input = Integer.parseInt(br.readLine());
			boolean ok = true;
			if(input == 0) {
				break;
			}
			for(int i=3; i<input/2; i++) {
				if(!prime[i] && !prime[input-i]) {
					bw.write(String.valueOf(input)+" = "+String.valueOf(i)+" + "+String.valueOf(input-i)+"\n");
					ok = false;
					bw.flush();
					break;
				}
			}
			if(ok) {
				bw.write("Goldbach's conjecture is wrong."+"\n");
				bw.flush();
			}	
		}
		bw.close();
	}
}
