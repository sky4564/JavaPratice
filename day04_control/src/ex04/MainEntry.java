package ex04;

public class MainEntry {
	public static void main(String[] args) {
		
		
		
		
		
		for(int i  = 1; i <=5 ; i++) {
			System.out.println("hello ~ " + i);
		}
		
		System.out.println("==============================================");
		//초기값, 증감식은 2개이상 가능 ( 단 , 조건은 오직 1개!!)
		
		
		int a,b;
		
		for(a= 1 , b = 2; a<=10;  a++, b+=2) {
			System.out.println(a);
		}
		
		System.out.println("==============================================");
		//초기값 증감식은 생략가능 (단 , 조건을 생략하면 무한루프)
		
		a =1 ; b =20;
		for( ; a<20 ; ) {
			System.out.println(a);
			a++;
			b--;
		}
		
		
		System.out.println("==============================================");
		
		
		for(;;) {//무한루프
			System.out.println("123");
			//if(조건) break; // 탈출구문
		}
		
		
	}

}
