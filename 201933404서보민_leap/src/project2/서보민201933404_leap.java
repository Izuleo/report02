package project2;

import java.util.Scanner;

public class 서보민201933404_leap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요: ");
		int year = scanner.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			//year을 4로 나눈 값이 0이고, 100으로 나눈 몫이 0이 아니면(100으로 나눠지면 평년임)
			//year을 400으로 나눈 값이 0이면 실행
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
			

	}

}
