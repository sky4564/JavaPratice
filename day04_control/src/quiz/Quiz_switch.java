package quiz;

import java.util.Scanner;

public class Quiz_switch {

	public static void main(String[] args) {
		// 사칙연산프로그램 작성 - 연산자 1개 , 정수 숫자 두개
		
		System.out.println("정수두개와 사칙연산자를 입력하세요");
		
		int x = new Scanner(System.in).nextInt();
		int y = new Scanner(System.in).nextInt();
		char cal = new Scanner(System.in).next().charAt(0);
		
		int result = 0;
		
		
		
		switch (cal) {
		case '+': result = x + y; break;
		case '-': result = x - y; break;
		case '*': result = x * y; break;
		case '/': result = x / y; break;
		default : result = 0;
		} // end
		
		System.out.println("계산결과는 : " + result);

	}


}

