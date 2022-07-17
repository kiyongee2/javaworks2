package decorator.bufferdstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {
		try(FileWriter fr = new FileWriter("animal.txt");
			BufferedWriter bw = new BufferedWriter(fr)){
			bw.write("cat");
			bw.write(32);    //스페이스 
			bw.write("dog");
			bw.write(32);
			bw.write("chicken");
			bw.write(32);
			bw.write("pig");
			bw.write(32);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
