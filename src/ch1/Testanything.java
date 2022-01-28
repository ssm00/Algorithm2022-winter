package ch1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Testanything{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		
		int flag = 0;
		if(input.length()<50) {
			for(char ch : input.toCharArray()) {
				if(!Character.isLowerCase(ch)) {
					flag = 1;
				}
			}
		}
		if(flag == 0) {
			System.out.println(input+"??!");
		}
	}
}