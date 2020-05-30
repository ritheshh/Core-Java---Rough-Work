package serialization;

import java.io.*;

public class DeSerializationClass {
	public DeSerializationClass() {
		// TODO Auto-generated constructor stub
		try {
			FileInputStream fin = new FileInputStream("Student Data.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			
			Student s = (Student)in.readObject();
			
			System.out.printf("%d %s %d",s.rollNumber, s.name, s.totalMark);
			in.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
