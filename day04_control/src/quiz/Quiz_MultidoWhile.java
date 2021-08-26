package quiz;

public class Quiz_MultidoWhile {

	public static void main(String[] args) {
		int i = 2 , j = 1; // 변수의 초기화 
		
		do {
			j = 1;
			i ++;
		
			
			
			do {
				
				System.out.print(i + "x" + j + " = " + i*j);
				j++; //증감식
				} while(j <= 9); // 조건
			
			
			
			} while( i <= 9); //조건 
			

	}

}


