package project1;

import java.util.Scanner;

public class ������201933404_gugu {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //��ĳ�� ����
		
		System.out.println("���ϴ� �ϳ��� ���� �Է��ϼ���: ");
		int num = scanner.nextInt(); //�Է¹��� ���ڸ� num�� ����
		
		for(int i=0; i<10; i++) {
			System.out.println(num + "X" + i + "=" + num*i);
		}		
		

	}

}
