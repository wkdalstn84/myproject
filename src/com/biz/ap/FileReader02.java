package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * grade.txt ������ �о
 * ���ڵ��� ��ü �հ踦 ����Ͽ� ���
 */
public class FileReader02 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/ap/grade.txt";
		
		// intSum ������
		// try ������ ����� �Ŀ��� �����Ϸ���
		// try ���� ������ ����, �������־�� �Ѵ�.
		int intSum = 0;
		
		try {
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			
			String line = new String();
			while(true) {
				line = buffer.readLine();
				if(line == null) break;
				int intNum = Integer.valueOf(line);
				intSum += intNum;
				
			}
			buffer.close();
			fileReader.close();
			
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
		// ���⿡ �հ� ǥ�� �ڵ带 �ۼ��ϸ�
		// �ּ��� �������� ���� �κп� ���� �հ�� ���� �ִ�.
		System.out.println("�հ� : " + intSum);
	}
}
