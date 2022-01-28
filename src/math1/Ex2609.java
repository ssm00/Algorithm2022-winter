package math1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//최대공약수 최소공배수
public class Ex2609 {
	
	int gcd(int a,int b) {
		int r;
		while(b != 0) {
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
	int lcm(int a, int b) {
		return a*b / gcd(a,b);
	}
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Ex2609 e = new Ex2609();
		String [] a = br.readLine().split(" ");
		int first = Integer.parseInt(a[0]);
		int second = Integer.parseInt(a[1]);
		
		bw.write(e.gcd(first, second) + "\n");
		bw.write(String.valueOf(e.lcm(first, second)));
		bw.close();
	}
}
