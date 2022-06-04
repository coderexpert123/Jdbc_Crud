package defaults;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sms.student.Student;
import sms.student.studentdao;

public class hello {
	public static void main(String[] args ) throws IOException {
		System.out.println("Welcome to Student Management Application");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			//id,name,phone,city
			
			System.out.println("1 to Add");
			System.out.println("2 to Delete");
			System.out.println("3 to Display");
			System.out.println("4 to exit ");
			int c=Integer.parseInt(br.readLine());
			
			if (c==1) {
				//add
				System.out.println("Enetr username");
				String name=br.readLine();
				System.out.println("Enetr phone");
				String phone=br.readLine();
				System.out.println("Enetr city");
				String city=br.readLine();
				
				// create student object
				Student stsStudent=new Student(name,phone,city);
				
				
				Student st=new Student(name,phone,city);
				
				
 			System.out.println(st);
 			
 			boolean sts = studentdao.insertStudentTodb(st);
 			if (sts) {
				System.out.println("Added");
			}
 			else {
				System.out.println("Not Added");
			}
			}
			
			// Delete Student
			else if(c==2) {
				
				System.out.println("Enter the Id That you want to delete");
				int userId=Integer.parseInt(br.readLine());
				boolean deletestudent = studentdao.deletestudent(userId);
				if (deletestudent) {
					System.out.println("Deleted");
				}
				else {
					System.out.println("Not Deleted ");
				}
 
			}
			else if(c==3) {
							
			//display
				
				studentdao.showAll();
			}
			else if(c==4) {
					
			//exit
			break;
					
			}
			else {
				
				
			}
		}
System.out.println("Thanks for using student portal \n see you soon :) ");
	}

}
