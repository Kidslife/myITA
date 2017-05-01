package student;

import java.util.ArrayList;
import java.util.List;

import student.Student;

public class StudentService {
	private Student student1;
	private Student student2;
	private Student student3;

	public Student getStudent1() {
		return student1;
	}

	public void setStudent1(Student student1) {
		this.student1 = student1;
	}

	public Student getStudent2() {
		return student2;
	}

	public void setStudent2(Student student2) {
		this.student2 = student2;
	}

	public Student getStudent3() {
		return student3;
	}

	public void setStudent3(Student student3) {
		this.student3 = student3;
	}

	public List<Student> getTheBestStudentByRank() {
		Student res = student1;
		if (student2.getRank() > res.getRank()) {
			res = student2;
		}
		if (student3.getRank() > res.getRank()) {
			res = student3;
		}
		List<Student> resList = new ArrayList<>();
		resList.add(res);
		return resList;

	}

	public StudentService(Student student1, Student student2, Student student3) {
		super();
		this.student1 = student1;
		this.student2 = student2;
		this.student3 = student3;
	}

}
