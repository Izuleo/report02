package project1;

import java.util.Scanner;

public class 서보민201933404_gugu {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //스캐너 생성
		
		System.out.println("원하는 하나의 수를 입력하세요: ");
		int num = scanner.nextInt(); //입력받은 숫자를 num에 저장
		
		for(int i=0; i<10; i++) {
			System.out.println(num + "X" + i + "=" + num*i);
		}		
		

	}

}
