/*package ch1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Queue3{
	int [] queue = new int[10000];
	int begin = 0;
	int end = 0 ;
	
	int empty() {
		if(begin == end) {
			return 1;
		}else {
			return 0;
		}
	}
	
	void push(int p) {
		queue[end++] = p;
	}
	int pop() {
		if(empty()==1) {
			return -1;
		}else {
			return queue[begin++];
		}
		}
	
	int size() {
		return end-begin;
	}
	
	int front(){
		if(empty()==1) {
			return -1;
		}else {
			return queue[begin];
		}
	}
	int back() {
		if(empty()==1) {
			return -1;
		}else {
			return queue[end-1];
		}
		
	}
	
}


public class Ex10845 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue3 q = new Queue3();
		int cnt = Integer.parseInt(bf.readLine());
		
		while(cnt-- > 0) {
			String input = bf.readLine();
			StringTokenizer st = new StringTokenizer(input);
			String type = st.nextToken();
			switch(type) {
				case "front" :
					System.out.println(q.front()); 
					break;
				case "pop" :
					System.out.println(q.pop());
					break;
				case "size" :
					System.out.println(q.size());
					break;
				case "empty" :
					System.out.println(q.empty());
					break;
				case "back" :
					System.out.println(q.back());
					break;
				case "push":
					int num = Integer.parseInt(st.nextToken());
					q.push(num);
					break;
			}
			
		}
		bw.flush();
		bf.close();
	}
}
*/