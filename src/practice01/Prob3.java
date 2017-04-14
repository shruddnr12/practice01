package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		
		int number = scanner.nextInt();
		int result = 0;
		
		while(true){
			if(number % 2 == 0)
			{
				
				for(int i = 2; i <= number;i+=2)
				{
					result += i;
				}
				System.out.println("결과 값: " + result);
				break;
			}
			else
			{
				for(int i = 1; i <= number;i+=2)
				{
					result += i;
				}
				System.out.println("결과 값: " + result);
				break;
			}
		}
		scanner.close();
	}
}
