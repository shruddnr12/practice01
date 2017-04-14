package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요");
		String text = scanner.nextLine();
		int length = text.length();
		for(int i = 0; i < length; i++)
		{
			String result = text.substring(0, i+1);
			System.out.println(result);
		}
		
		scanner.close();
	}
}