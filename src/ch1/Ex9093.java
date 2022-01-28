package ch1;

import java.util.*;
//미완성
public class Ex9093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		sc.nextLine();
		
		while(cnt-- >0) {
			String ex = sc.nextLine();
			char [] ch = ex.toCharArray();
			System.out.println(ch);
			List<Character> l = new ArrayList<Character>();
			for(char each : ch) {
				if(each == ' ' || each== '\n') {
					Collections.reverse(l);
					ListIterator li = l.listIterator();
					while(li.hasNext()) {
						System.out.print(li.next());
					}
					li.add(' ');
				}else {
					l.add(each);
				}
				
			}
			
		}
		
		
		
		
	}
}
