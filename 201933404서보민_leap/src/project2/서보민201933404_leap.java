package project2;

import java.util.Scanner;

public class ������201933404_leap {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���: ");
		int year = scanner.nextInt();
		
		if((year%4==0 && year%100!=0) || year%400==0) {
			//year�� 4�� ���� ���� 0�̰�, 100���� ���� ���� 0�� �ƴϸ�(100���� �������� �����)
			//year�� 400���� ���� ���� 0�̸� ����
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ����Դϴ�.");
		}
			

	}

}
