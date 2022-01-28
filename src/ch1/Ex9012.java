package ch1;
//괄호
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Ex9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int cnt = Integer.parseInt(bf.readLine());
		
		
		while(cnt-- >0) {
			Stack<Character> stack = new Stack<Character>();
			String ex = bf.readLine();
			int flag = 0;
			for(char ch : ex.toCharArray()) {
				if(ch == '(') {
					stack.push(ch);
				}else if(stack.isEmpty()) {
					flag = 1;
					break;
				}else{
					stack.pop();
					}
				}
			if(flag == 1 || !stack.isEmpty()) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
			
		}
		bw.close();
		
	}
}
