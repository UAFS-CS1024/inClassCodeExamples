package inClassSep13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assignment {
	
	public static final int SIZE=200;

	public static void main(String[] args) throws IOException {
		String[] contents = new String[SIZE];
		String fileName="test.txt";
		int count;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Filename: ");
		fileName=keyboard.nextLine();
		count=readFile(fileName,contents);
		showContents(contents,count);
	}
	
	public static int readFile(String fileName, String[] contents) throws IOException {
		int count=0;
		String buffer="";
		FileReader inFile = new FileReader(fileName);
		BufferedReader in = new BufferedReader(inFile);

		buffer=in.readLine();
		while(buffer!=null) {
			contents[count++]=buffer;
			buffer=in.readLine();
		}
		
		in.close();
		inFile.close();
		return count;
	}
	
	public static void showContents(String[] contents, int count) {
		int index;
		
		for(index=0;index<count;index++) {
			System.out.printf("[%d]: %s\n", index,contents[index]);
		}
	}

}
