package com.biz.ap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 3���� ���� ���� �����ؼ�
 * ���ڸ� �ݷ�(:)���� �����Ͽ� ����ϱ�
 * 
 * 90:80:70
 */
public class FileWriter02 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/ap/grade1.txt";
		
		FileWriter fileWriter = null;
		BufferedWriter buffer = null;
		
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			for(int i = 0; i < 50; i++) {
				int intKor = (int)(Math.random() * (100-50)+50);
				int intEng = (int)(Math.random() * (100-50)+50);
				int intMath = (int)(Math.random() * (100-50)+50);
				
				String strKor = String.valueOf(intKor);
				String strEng = String.valueOf(intEng);
				String strMath = String.valueOf(intMath);
				
				buffer.write(strKor);
				buffer.write(" : ");
				buffer.write(strEng + " : " + strMath);
				buffer.newLine();
				
			}
			buffer.flush();
			buffer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����ǥ �ۼ� �Ϸ�!");
	}

}
