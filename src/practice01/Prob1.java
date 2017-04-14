package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력하시오: ");
		int number = scanner.nextInt();
		
		System.out.println(number); // 입출력시에는 확인하는 작업을 하는게 좋다. 
		
		scanner.close(); // 명시적으로 닫아 줘야 좋다. 물론 프로그램이 끈나면 끈나지만...
		
		if(number%3 == 0)
		{
			System.out.println("3의 배수입니다");
		}
	}
}
