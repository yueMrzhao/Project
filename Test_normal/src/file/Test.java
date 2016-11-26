package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args){
		File file = new File("D:\\abc.txt");
		try {
			FileInputStream fileStream = new FileInputStream(file);
			byte[] bytes = new byte[1024];
			fileStream.read(bytes);
			String aa = bytes.toString();
			String a = new String(bytes,"GBK");
				System.out.println(a);
			File file1 = new File("D:\\cc2.txt");
			Boolean isExist = file1.exists();
			if(!isExist){
				file1.createNewFile();
			}
			FileOutputStream filewrite = new FileOutputStream(file1);
			filewrite.write(bytes);
		} catch (FileNotFoundException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e){
			
		}
		
	}
}
