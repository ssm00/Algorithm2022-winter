package ch1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
// 요세푸스 

public class Ex1158 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s =br.readLine();
		StringTokenizer st = new StringTokenizer(s);
	
		int first = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());
	
		Queue<Integer> q = new LinkedList<>();
		int [] out = new int[first]; 
		
		for(int i=1; i<first+1; i++) {
			q.add(i);
		} //queue에 추가
		
		int flag = 0;
		while(!q.isEmpty()) {
			for(int i=0; i<second-1; i++) {
				q.add(q.poll());
			}
			out[flag++] = q.poll();	
		}
		
		bw.write("<");
		for(int i=0; i<out.length; i++) {
			bw.write(String.valueOf(out[i]));
			if(i==out.length-1) {
				bw.write(">");
			}else {
				bw.write(", ");
			}
		}
		bw.flush();
	}

}
