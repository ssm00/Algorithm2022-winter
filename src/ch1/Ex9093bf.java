package ch1;
import java.util.*;
import java.io.*;

public class Ex9093bf {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(bf.readLine());
		Stack<Character> st = new Stack<Character>();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(cnt-- > 0) {
			String input = bf.readLine()+'\n';
			for(char ch : input.toCharArray()) {
				if(ch == ' ' || ch== '\n') {
					while(!st.isEmpty()) {
						bw.write(st.pop());
					}
					bw.write(ch);
				}else {
					st.push(ch);
				}
			}
			
		}
		bw.flush();
		
	}
}
