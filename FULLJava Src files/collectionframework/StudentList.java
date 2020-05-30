package collectionframework;

import java.util.List;
import java.util.stream.Collectors;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.io.*;

public class StudentList {

	public static void main(String[] args) throws IOException {
//		ArrayList<String> list1 = new ArrayList<String>();
//		list1.add("hello");
//		list1.add("java");
//		list1.add("programmming");
//		
//		Iterator<String> ite = list1.iterator();
//		while(ite.hasNext())
//			System.out.println(ite.next());
//		
//		// Converting a list to array.
//		String[] str = list1.toArray(new String[list1.size()]);
//		System.out.println(Arrays.toString(str));
//	
//		int[] intArray = new int[] {10, 21, 32, 43, 54, 65, 76, 87, 98, 9};
//		ArrayList<Integer> boo = (ArrayList<Integer>) Arrays.stream(intArray).boxed().collect(Collectors.toList());
//		System.out.println(boo);
//		intArray = new int[] {1,2,3,4};
//		boo.clear();
//		System.out.println(boo);
//		System.out.println(Arrays.toString(intArray));
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student(1,"Jhon", 123));
		students.add(new Student(2,"Ruke", 345));
		students.add(new Student(3,"Lame", 321));
		students.add(new Student(4,"Ash", 456));
		students.add(new Student(5,"Gunther", 566));
		students.add(new Student(6,"Basu", 345));
		
		Comparator<Student> com = (s1, s2) -> {
			if(s1.totalMarks>s2.totalMarks)
				return 1;
			else if(s1.totalMarks<s2.totalMarks)
				return -1;
			
			return 0;
		};
		
		Collections.sort(students, com);
		
		for(Student values : students) {
			System.out.printf("RollNo: %d\tName: %s\tTotal Marks:%d\n",values.rollNum, values.name, values.totalMarks);
		}
		
		  FileOutputStream fout = new FileOutputStream("Student Data.txt");  
		  ObjectOutputStream out = new ObjectOutputStream(fout);  
		  out.writeObject(students);  
		  out.flush();  
		  
		  //closing the stream  
		  out.close();
	}
}

class Student {
	int rollNum, totalMarks;
	String name;
	Student(int roll, String name, int marks) {
		this.rollNum = roll;
		this.name = name;
		this.totalMarks = marks;
	}	
}
