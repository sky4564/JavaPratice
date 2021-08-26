package quiz;

//문제 1 ~100 중에서 3의 배수의 개수와 합을 구하세요


public class Quiz_Control {
	public static void main(String[] args) {

		
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= 100; i++) 
		{
			if(i%3 == 0) {
				sum += i;
				count++;
				}
			
		}
		
		System.out.println("합 : " + sum + "갯수 : " + count);
	}
}
