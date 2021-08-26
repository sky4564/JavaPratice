package quiz;

import java.util.Scanner;

public class Quiz_IF_Switch {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("전산점수 몇점 ? ");
		int x = sc.nextInt();
		System.out.println("수학점수 몇점 ? ");
		int y = sc.nextInt();
		System.out.println("국어점수 몇점 ? ");
		int z = sc.nextInt();
		
		double avg = (x+y+z)/3;
		
		
		switch ((int)avg/10) {
		case 10 : case 9 : case 8 : case 7 : case 6 :
		case 5 : if() {
			System.out.println("평균50이하임" + avg + " 점");
			}
			
		
		
		
		
		
		
		
		default : System.out.println("평균 60이상 합격 ㅅㄱ" + avg + " 점" );
		} // end
		
		

	}
		
}