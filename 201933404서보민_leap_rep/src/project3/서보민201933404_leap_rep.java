package project3;

import java.util.Scanner;

public class ������201933404_leap_rep {

	public static void main(String[] args) {
        
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("������ �Է��ϼ���: ");
			int year = scanner.nextInt();
			
			if(year>0) {
				if((year%4==0 && year%100!=0) || year%400==0) {
					//year�� 4�� ���� ���� 0�̰�, 100���� ���� ���� 0�� �ƴϸ�(100���� �������� �����)
					//year�� 400���� ���� ���� 0�̸� ����
					System.out.println(year + "���� �����Դϴ�.");
				} else {
					System.out.println(year + "���� ����Դϴ�.");
					System.out.println();
				}//if1	
			} else {
				System.out.println("0���� ���� ���� �Է¹޾ҽ��ϴ�. ���α׷��� �����մϴ�.");
				break;
			}//if2

		}//while

	}

}
