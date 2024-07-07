package filereadandwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {

	public static void main(String[] args) {

		File file = new File("E:\\New folder\\test.txt");

		try {
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Welcome");
			bw.write(" Sujith");
			bw.close();
			
			
			FileReader fr = new  FileReader(file);
			BufferedReader br = new  BufferedReader(fr);
					
			String str = br.readLine();
			while (str != null) {
				System.out.println("Str "+str);
				str = br.readLine();
			}
					
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
