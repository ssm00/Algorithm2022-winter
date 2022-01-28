package datastructure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
//레이저
public class Ex10799 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Character> st = new Stack<Character>();
		String s = br.readLine();
		
		int result = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') {
				st.push(s.charAt(i));
			}else {
				if(s.charAt(i-1)=='(') {
					st.pop();
					result += st.size();
				}else {
					st.pop();
					result = result+1;
				}
			}
			
		}
		bw.write(String.valueOf(result));
		
		bw.close();
		
	}
}
