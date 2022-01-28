package datastructure;
//단어뒤집기 2
//한번 더해보기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex17413 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack<Character> st = new Stack<Character>(); //뒤집기 유형은 stack사용하자
		
		String input = br.readLine();  //문장 받기
		
		int flag = 0; // 바꾸기 모드
		
		for(char ch : input.toCharArray()) {  //한단어씩 char로 받기 
			if(ch == '<') {
				flag = 1;
				while(!st.isEmpty()) {
					bw.write(st.pop());
				}
				bw.write(ch);
			}else if(ch == '>') {
				flag = 0;
				bw.write(ch);
			}else if(ch == ' ') {
				while(!st.isEmpty()) {
					bw.write(st.pop());
				}
				bw.write(ch);	
			}else {
				if(flag == 1) {
					bw.write(ch);
				}else {
					st.push(ch);
				}
			}
		}
		while(!st.isEmpty()) {
			bw.write(st.pop());
		}
		
		bw.flush();
		bw.close();
	}

}
