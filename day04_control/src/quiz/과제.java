package quiz;

import java.util.Scanner;



public class 과제 {

	public static void main(String[] args) {
		try {
		int x=0,y=0,z=0 ;  char c;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("국어 점수를 입력하세요 : ");
			x = sc.nextInt();

		}	while(x <0 || x >100);
		
			System.out.println("다음으로 넘어갈까요 ? Y//N ");
			
			while(true) {
				c = sc.next().charAt(0);
				
				
				if(c == 'Y') break; //탈출구문
				
				
			}
		
		do {
			System.out.println(" 전산 점수를 입력하세요 : ");
			y = sc.nextInt();

		}	while(y <0 || y >100);
		System.out.println("다음으로 넘어갈까요 ? Y//N ");
		
		while(true) {
			c = sc.next().charAt(0);
			
			
			if(c == 'Y') break; //탈출구문
			
			
		}
		
		do {
			System.out.println("영어 점수를 입력하세요 : ");
			z = sc.nextInt();

		}	while(z <0 || z >100);
		
		System.out.println("다음으로 넘어갈까요 ? Y//N ");
		
		while(true) {
			c = sc.next().charAt(0);
			
			
			if(c == 'Y') break; //탈출구문
			
			
		}
		
		int sum = x+y+z;
		float avg = sum/3;  //크기가 같아도 묵시적 형변환이 일어나는듯.
		
		
		
		System.out.println("이도연님의 성적표");
		System.out.println("국어 : "+ x + ", " + "전산 : "+ y + ", " + "영어 : "+ z);
		System.out.println("총점 : " + sum+", " + "평균: " + String.format("%.2f", avg));
		} catch (ArithmeticException e) {
			System.out.println("숫자에러임 ㅅㄱ");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("허허허허허 이건 안뜨겠지");
		} catch (Exception e) {
			System.out.println("에러남 ㅅㄱ");
		} finally {
			System.out.println("★!!congaturation!!★");
		}	
	}
}	


