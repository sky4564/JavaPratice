package ex03;

import java.util.Scanner;

public class SwitchEx3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1, 2, 3 중에서 숫자 입력 요망 : ");
		int point = sc.nextInt();
		
		switch(point) {
		case 1 : System.out.print(" 집 "); //break ;
		case 2 : System.out.print(" 피아노 "); //break ;
		case 3 : System.out.print(" 우산 "); break ;
		default :
			System.out.println("범위에 없는 숫자 입니다.");
			System.exit(0);
		
		}// end
		
		System.out.println("상품에 당첨 되셨습니다.!!! \n");

	}

}
