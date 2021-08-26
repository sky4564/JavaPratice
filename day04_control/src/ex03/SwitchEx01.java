package ex03;

import java.util.Scanner;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		System.out.println("score = ");
		
		int score = new Scanner(System.in).nextInt();
		char grade = ' ';
		
		switch (score/10) {
		case 100 :
		case 90 : grade = 'A' ; break;
		case 80 : grade = 'B' ; break;
		case 70 : grade = 'C' ; break;
		case 60 : grade = 'D' ; break;
		default : grade = 'F';
		} // end
		
		System.out.println("\n\n jumsu = " + score + "\t∆Ú¡°¿∫"  + grade);

	}

}
