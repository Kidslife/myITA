package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import student.Group;
import student.Student;
import student.StudentService2;

public class Main { // not all done yet   переробити в студсерв2 замість масиву зробити ліст

	public static void main(String[] args) {
		Group g1 = Group.G1;
		Group g2 = Group.G2;
		Group g3 = Group.G3;
		Group g4 = Group.G4;

		Student stud1 = new Student();
		stud1.setFirstName("Ivan");
		stud1.setLastName("Ivanenko");
		stud1.setGroup(g1);
		stud1.setRank(1);

		Student stud2 = new Student();
		stud2.setFirstName("Sergiy");
		stud2.setLastName("Savchenko");
		stud2.setGroup(g1);
		stud2.setRank(2);

		Student stud3 = new Student();
		stud3.setFirstName("Petro");
		stud3.setLastName("Grinchenko");
		stud3.setGroup(g1);
		stud3.setRank(3);

		// StudentService studService = new StudentService(stud1, stud2, stud3);

		// System.out.println(studService.getTheBestStudentByRank());

		ArrayList<Student> stud = new ArrayList<>();
		stud.add(stud1);
		stud.add(stud2);
		stud.add(stud3);
		StudentService2 studService2 = new StudentService2();
		Student[] std = new Student[stud.size()];
		stud.toArray(std);
		studService2.setStudents(std);
		//System.out.println(studService2.getTheBestStudentByRank(g1));
		

		
		//studService2.removeStudent();
		//System.out.println(studService2.getStudents());
		

		
		List<Student> l = new ArrayList<>();
		
		l.add(stud1);
		l.add(stud2);
		
		Iterator<Student> iter = l.iterator();
		while(iter.hasNext()){
			Student i = iter.next();
			if (i.lessThan(1)){
				iter.remove();
			}
		}
		
		System.out.println(l);
		
		Student[] sss = {stud1, stud2};

	}

}
