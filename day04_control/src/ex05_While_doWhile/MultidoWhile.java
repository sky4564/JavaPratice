package ex05_While_doWhile;

public class MultidoWhile {

	public static void main(String[] args) {
		int a = 1 , b = 1; // 변수의 초기화 
		
		do {
			b=1 ; 
			
			do {

				System.out.print(b + "\t" );
				b++; //증감식
			} while(b <= 3);{ // 조건
			System.out.println();
			a++; //증감
			}
		} while( a <= 2); //조건 
			

	}

}
