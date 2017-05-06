package student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import student.Group;
import student.Student;

public class StudentService2  {			// 
private Student[] students;

private Student student1;
private Student student2;
private Student student3;

private  List <Student> studlist = new LinkedList<Student>();

public StudentService2() {
	studlist.add(student1);
	studlist.add(student2);
	studlist.add(student3);
}
	
	
	public Student[] getStudents() {
		return students;
	}
	public void setStudents(Student[] students) {
		this.students = students;
		studlist = Arrays.asList(students);
	}
	
	
	public List<Student> getTheBestStudentByRank(Group g){
		List<Student> res = new ArrayList<>();
		
		double maxRank = students[0].getRank();
		
		for (Student stud : students){
			if (stud.getGroup().equals(g) && maxRank < stud.getRank()){
				maxRank = stud.getRank();
			}
		}
		
		for (Student stud : students){
			if (maxRank == stud.getRank()){
				res.add(stud);
			}
		}
		
		return res;
		
	}
	
	public void removeStudent () {
		Iterator<Student> iter = studlist.iterator();
		
	while(iter.hasNext()){
		Student st = iter.next();
		
		if (st.lessThan(2)){
			System.out.println(st);
			iter.remove();
			//iter.remove();
		}

	}
	
	
	}

	

}
