package com.biz.ap;

import java.util.Scanner;

/*
 * Ű���忡�� ���ڸ� �Է¹޾Ƽ�
 * �Է¹��� ���ڵ��� ���� ���ؼ�
 * �ֿܼ� ǥ��
 */
public class TryCatch02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int intSum = 0; // �հ踦 ���� ����
		
		while(true) {
			
			System.out.print("����>>");
			// Ű���忡�� ���ڿ� �Է�
			String str = scanner.nextLine();
			
			// �Է¹��� ���ڿ��� "~END"�̸� �����ϰ�
			// �� ���
			if(str.equals("~END")) break;
			
			try {
				// ���ڿ��� ���ڷ� ��ȯ
				int intNum = Integer.valueOf(str);
				
				// ��������
				intSum += intNum;
				
			} catch (Exception e) {
				System.out.println("���ڿ��� ���ڷ� ��ȯ��Ű�� ��");
				System.out.println("������ �߻��߽��ϴ�.");
				System.out.println("�ٽ� �Է��� �ּ���.");
			}
		}
		System.out.println("�հ� : " + intSum);
	}
}
