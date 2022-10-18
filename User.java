import java.util.Scanner;
class User 
{
	public static void main(String[] args) 
	{
		Scanner Sc=new Scanner(System.in);

		System.out.println("enter the student name");
		String name=Sc.next();

		System.out.println("enter the student id");
		int id=Sc.nextInt();

		System.out.println("enter the student mark");
		double mark=Sc.nextDouble();

		System.out.println("enter the student grade");
		char grade=Sc.next().charAt(0);

		System.out.println("welcome to the student database");
		System.out.println("enter the student :"+name);
		System.out.println("enter the student :"+id);
		System.out.println("enter the student :"+mark);
		System.out.println("enter the student :"+grade);

	}
}
