package secLtask;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) {
		
			ArrayList <Person> pers = new ArrayList <Person>();

			try {
				Scanner s = new Scanner (new File ("text.txt"));
				
				while (s.hasNextLine()) {
					Person persx = new Person();
					persx.setName(s.next());
					persx.setBirthYear(s.next());
					pers.add(persx);
					
				}
			for (Person p : pers){
			System.out.println(p.toString());
			}
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			pers.get(0).changeName("Vasya");
			for (Person p : pers){
				System.out.println(p.toString());
				}
			

			
			
					

					


			

	}
	}

