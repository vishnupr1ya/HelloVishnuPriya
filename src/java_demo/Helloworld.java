package java_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Helloworld {
	public static void main(String[]args) {
		//List<Student> studentList = new ArrayList<>();
		Map<Integer,Student> map = new HashMap<>();
		Student student1 = new Student("Ravi", 101);
		Student student2 = new Student("Meena", 102);
		Student student3 = new Student("Leena", 104);
		map.put(1,  student1);
		map.put(2, student2);
		map.put(3, student3);
		
		
		Set<Entry<Integer,Student>> entrySet = map.entrySet();
		for(Map.Entry<Integer,Student> entry  : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		Set<Student> studentList = new HashSet<>();
		//Student student1 = new Student("Ravi", 101);
		//Student student2 = new Student("Meena", 102);
		//Student student3 = new Student("Leena", 104);
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		for(Student student : studentList) {
			System.out.println(student.name +","+ student.id);
		}
		
		

}
}
