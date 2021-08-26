package quiz;

import java.util.Scanner;

public class Quiz_For {
	public static void main(String[] args) {
		//1.원하는 단을 입력 받아서 구구단 출력
		System.out.println("몇 단 입력 하실 래여  ? ??");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i;
		for(i = 1; i <= 9 ; i++)
		{
			System.out.println(x + "x" + i + " = " + x*i);
		}
		
		
		
		
		//2. 전체 구구단 출력
		
		int i; int j;
		for(i = 2; i <= 9 ; i++)
		{
			for(j=1  ; j <= 9; j++) {
				System.out.println(i + "x" + j + " = " + i*j);
			}
		
		}
		
		
		
		
	}

}
