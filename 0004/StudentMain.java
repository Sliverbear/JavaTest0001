package day4;

import java.util.*;
public class StudentMain {
	private Student studentarr[];
	private Scanner sc;
	int noofstudent;
	//CRUD=Create,REtereive ,update,Delete
	public StudentMain()
	{
		sc=new Scanner(System.in);
		
	}
	public void insert()
	{
		System.out.println("Enter how many students u want to accept");
		noofstudent=sc.nextInt();
		studentarr=new Student[noofstudent];

		for(int x=0;x<studentarr.length;x++)
		{
			studentarr[x]=new Student();
			System.out.println("Enter Student id");
			studentarr[x].setStudentid(sc.nextInt());
			System.out.println("Enter Student name ");
			studentarr[x].setStudentname(sc.next());
			System.out.println("Enter Score ");
			studentarr[x].setScore(sc.nextInt());
			System.out.println("Data inserted");
		}
				
	}
	public void delete()
	{
		System.out.println("Enter the Student id which u want to delete");
		int studentdelete=sc.nextInt();
		for(Student s:studentarr)
		{
			if(s.getStudentid()==studentdelete)
			{
				s.setStudentid(0);
				s.setStudentname(null);
				s.setScore(0);
				System.out.println("Data deleted");
			}
		}
		
	}
	public void update()
	{
		System.out.println("Enter studentid which u want to updated");
		int studentupdate=sc.nextInt();
		for(Student s1:studentarr)
		{
			if(s1.getStudentid()==studentupdate)
			{
				System.out.println("Enter new score");
				s1.setScore(sc.nextInt());
				System.out.println("Data updated");
			}
		}
		
	}
	public void menu()
	{
		String choice="y";
		while(choice.equals("y"))
		{
			System.out.println("Enter your choice ");
			System.out.println("1.Insert Details ");
			System.out.println("2. Delete Details ");
			System.out.println("3. Update Details ");
			System.out.println("4. View Details ");
			System.out.println("5. Exit");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
					insert();
					break;
			case 2:
					delete();
					break;
			case 3:
					update();
					break;
			case 4:
					retreive();
					break;
			case 5:
					System.exit(0);
			}
			System.out.println("Do u want to continue");
			choice=sc.next();
		}
	
		
	}
	public void retreive()
	{
		for(Student s:studentarr)
		{
			System.out.println("Student id is "+s.getStudentid());
			System.out.println("Student nameis "+s.getStudentname());
			System.out.println("Score is "+s.getScore());
		}
	}
	public static void main(String[] args) {
		StudentMain smain=new StudentMain();
		smain.menu();
			}

}