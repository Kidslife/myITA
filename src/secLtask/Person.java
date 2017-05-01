package secLtask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {
private String name;
private String birthYear;



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBirthYear() {
	return birthYear;
}

public void setBirthYear(String birthYear) {
	this.birthYear = birthYear;
}



public ArrayList <Person> readFromFile(String file){
	return null;
}

public static void output (String file, ArrayList <Person> pers, boolean append) {
	try {
		File f = new File (file);
		FileWriter fw = new FileWriter (f, append);
		PrintWriter pw = new PrintWriter (fw);
			for (Person p : pers) {
				pw.println(p);
		}
			pw.close();
	} catch (IOException e) {
		System.out.println("Error...");
	}

}


public String toString(){
	return name + " " + birthYear;
	
}
	
	public int age(){
		LocalDate currentD = LocalDate.now();
		DateTimeFormatter toDate = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate birth = LocalDate.parse(birthYear, toDate);
		int persAge = currentD.getYear() - birth.getYear();
	return persAge;
}

	public void changeName(String NaameWantToChange) {
		this.name = NaameWantToChange;
	}


}
