package datastructure;
//오큰수

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex17298 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Integer> st = new Stack<Integer>();
		int range = Integer.parseInt(br.readLine());
		
		String [] input = br.readLine().split(" ");
		
		int [] temp = new int [range];
		
		for(int i=0; i<range; i++) {
			temp[i] = Integer.parseInt(input[i]);
		}
		
		int [] output = new int [range];
		
		st.push(0);
		for(int i=1; i<range; i++) {
			if(st.isEmpty()) {
				st.push(i);
			}
			while(!st.isEmpty() && temp[st.peek()] < temp[i] ) {
				output[st.pop()] = temp[i];
			}st.push(i);	
		}
		
		while(!st.isEmpty()) {
			output[st.pop()] = -1;
		}
		
		for(int i =0 ; i<range; i++) {
			bw.write(String.valueOf(output[i]+" "));
		}
		
		bw.close();
	}
}
