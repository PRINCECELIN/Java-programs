import java.util.Scanner;
class User3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student id");
		int id=sc.nextInt(); 
		if (id==1)
		{

		System.out.println("enter the student name");
		String name1=sc.next();

		System.out.println("enter the student mark");
		double mark1=sc.nextDouble();

		System.out.println("enter the student grade");
		char grade1=sc.next().charAt(0);
		System.out.println("enter the student name;"+name1);
		System.out.println("enter the student mark:"+mark1);
		System.out.println("enter the student grade;"+grade1);
		}

		if (id==2)
		{
		System.out.println("enter the student name");
		String name2=sc.next();

		System.out.println("enter the student mark");
		double mark2=sc.nextDouble();

		System.out.println("enter the student grade");
		char grade2=sc.next().charAt(0);
		System.out.println("enter the student name:"+name2);
		System.out.println("enter the student mark:"+mark2);
		System.out.println("enter the student grade:"+grade2);
		}
		if (id==3)
		{
		System.out.println("enter the student name");
		String name3=sc.next();

		System.out.println("enter the student mark");
		double mark3=sc.nextDouble();

		System.out.println("enter the student grade");
		char grade3=sc.next().charAt(0);
		System.out.println("enter the student name:"+name3);
		System.out.println("enter the student mark:"+mark3);
		System.out.println("enter the student grade:"+grade3);
		}


		

	}
}
