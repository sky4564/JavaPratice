package day04_control;

import java.util.Scanner;

public class ex01_scanneeer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 객체생성, 메모리 할당, 생성자함수 자동호출됨 
		
		System.out.println("String input : ");
		
		String str = sc.next();
		String msg = sc.nextLine();
		//System.out.println("string next() is : " + str);
		System.out.println("string nextLine() is : " + msg);
	}

}
