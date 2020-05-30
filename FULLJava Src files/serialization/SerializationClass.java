package serialization;

import java.io.*;

class Student implements Serializable {
	int rollNumber, totalMark;
	String name;

	Student(int rollNumber, String name, int mark) {
		this.name = name;
		this.rollNumber = rollNumber;
		totalMark = mark;
	}
}

public class SerializationClass {
	public SerializationClass() {
		try{    
		  Student s1 =new Student(100158, "Rithesh", 678);
		  
		  //Creating stream and writing the object  
		  FileOutputStream fout=new FileOutputStream("Student Data.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(s1);  
		  out.flush();  
		  
		  //closing the stream  
		  out.close();
		  
		  System.out.println("Stream Complete");  
		  } catch(Exception e) {
			  System.out.println("Exception handled" + e);
		  }  
	}
}