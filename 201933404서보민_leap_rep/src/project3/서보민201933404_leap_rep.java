package project3;

import java.util.Scanner;

public class 서보민201933404_leap_rep {

	public static void main(String[] args) {
        
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("연도를 입력하세요: ");
			int year = scanner.nextInt();
			
			if(year>0) {
				if((year%4==0 && year%100!=0) || year%400==0) {
					//year을 4로 나눈 값이 0이고, 100으로 나눈 몫이 0이 아니면(100으로 나눠지면 평년임)
					//year을 400으로 나눈 값이 0이면 실행
					System.out.println(year + "년은 윤년입니다.");
				} else {
					System.out.println(year + "년은 평년입니다.");
					System.out.println();
				}//if1	
			} else {
				System.out.println("0보다 작은 수를 입력받았습니다. 프로그램을 종료합니다.");
				break;
			}//if2

		}//while

	}

}
