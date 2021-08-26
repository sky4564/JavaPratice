package ex07.main;

import java.util.Scanner;

public class WhileCharterSize {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = ' ' ;
		String str = null;
		int count = 0;
		
		System.out.println("아무값이나 입력 하세요 . '!' 를 누르면 탈출 : ");
		
		int su = 10;
		
		while(true) {
			str = sc.next();
			ch = str.charAt(0);
			
			if(ch == '!') break; //탈출구문
			
			count++;
			
		}
		System.out.println("총입력 받은 문자 갯수는 : " + count +"개");
		
		do {
			System.out.println("\n jumsu(0~100) = ");
			su = sc.nextInt();
		
		}while(su <0 || su >100);
	}
	
	
}
