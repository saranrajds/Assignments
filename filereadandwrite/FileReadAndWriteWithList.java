package filereadandwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FileReadAndWriteWithList implements Serializable {

	int i;
	String name;
	
	public FileReadAndWriteWithList(int i, String name) {
		this.i = i;
		this.name = name;
	}

	public static void main(String[] args) {

		List<FileReadAndWriteWithList> list = new ArrayList<FileReadAndWriteWithList>();
		list.add(new FileReadAndWriteWithList(10, "sujith"));
		list.add(new FileReadAndWriteWithList(20, "sharma"));
		
		File file = new File("E:\\New folder\\test2.txt");
		
		try {
			
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.close();
			
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<FileReadAndWriteWithList> tempList = (List<FileReadAndWriteWithList>) ois.readObject();
            System.out.println("List read from file:");
            
			for(FileReadAndWriteWithList temp: tempList) {
				System.out.println("List "+ temp.i +" "+ temp.name);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
				
	}

}
