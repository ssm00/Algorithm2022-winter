package ch1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Ex1406 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String st = br.readLine(); //입력받은 문장
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		//left 에 저장
		for(char ch : st.toCharArray()) {
			left.push(ch);
		}
		
		
		int cnt = Integer.parseInt(br.readLine()); //반복횟수
		
		for(int i=0; i<cnt ;i++) {
			String input = br.readLine();
			if(input.equals("L")) {
				if(!left.isEmpty()) {
					right.push(left.pop());
				}
			}else if(input.equals("D")) {
				if(!right.isEmpty()) {
					left.push(right.pop());
				}
			}else if(input.equals("B")) {
				if(!left.isEmpty()) {
					left.pop();
				}	
			}else if(input.charAt(0)=='P') {
				left.push(input.charAt(input.length()-1)); 
			}			
		}
		
		 for(int i=0; i<left.size(); i++) { bw.write(left.get(i)); }
		 //????????왜이런지 모름 
		 for(int i =0; i<right.size();) {bw.write(right.pop()); }
		 
		/*
		 * while(!left.isEmpty()) { right.push(left.pop()); }
		 * 
		 * // 출력 while(!right.isEmpty()) { System.out.print(right.pop()); }
		 */
		bw.close();
	}
}
