package cbg_training;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileBufferTestExample {

	
	public static void main(String[] args) {

		writeFile();
		writeFileBuffer();
	}

	private static void writeFile() {
		long starttime= System.currentTimeMillis();
		
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("d:\\text.txt");

			StringBuffer strBuffer = new StringBuffer();
			String str ="";
			for (int j = 0; j < 200000; j++) {
				str = "employee"+j;
				strBuffer.append(str);
			}
			byte[] data = strBuffer.toString().getBytes();
			fileOutputStream.write(data);
		
			fileOutputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("time taken using fileoutputstream ::"+(System.currentTimeMillis()-starttime));
	}
	private static void writeFileBuffer() {
		 
		long starttime= System.currentTimeMillis();
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("d:\\text2.txt");

			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

			StringBuffer strBuffer = new StringBuffer();
			String str ="";
			for (int j = 0; j < 2000; j++) {
				str = "employee"+j;
				strBuffer.append(str);
			}
			byte[] data = strBuffer.toString().getBytes();
			bufferedOutputStream.write(data);
			bufferedOutputStream.flush();
			bufferedOutputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("time taken using Bufferoutputstream ::"+(System.currentTimeMillis()-starttime));
	}
}
