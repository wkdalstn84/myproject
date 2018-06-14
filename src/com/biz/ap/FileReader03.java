package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader03 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/ap/grade.txt";
		
		// intSum ������
		// try ������ ����� �Ŀ��� �����Ϸ���
		// try ���� ������ ����, �������־�� �Ѵ�.
		int intSum = 0;
		
		// fileReader�� buffer�� try�� �ߴܵǴ���
		// �����ؼ� fileReader.close(), buffer.close()��
		// �����ؾ� �� �ʿ䰡 �ִ� �κ��̴�.
		// �׷���
		// �� ��ü�� try ������ �ϴ� �����ϰ�
		// try ���ο��� ��ü�� �����ϴ� �������
		// �ڵ带 �ۼ��Ѵ� ���� ����.
		FileReader fileReader = null; // ����
		BufferedReader buffer = null; // ����
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			
			String line = new String();
			while(true) {
				line = buffer.readLine();
				if(line == null) break;
				int intNum = Integer.valueOf(line);
				intSum += intNum;
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// ���⿡ �ڵ尡 ������
			// � exception�� ���� ���� �����϶�
			
			System.out.println("���� ������ ���ڰ� �ƴ� �κ��� ����");
		}
		
		// try���� ������ �߻��ϸ� �ǳ� �ٰ� ����� �κ�
		try {
			buffer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		try {
			fileReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		
		// ���⿡ �հ� ǥ�� �ڵ带 �ۼ��ϸ�
		// �ּ��� �������� ���� �κп� ���� �հ�� ���� �ִ�.
		System.out.println("�հ� : " + intSum);
	}
}
