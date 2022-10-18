import java.util.Scanner;
class Method1  
{
	public static void main(String[] args) 
	{
		even();
				
	}
	public static void even()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
		if (num%2==0)
		{
			System.out.println("it is an even num");
		}
		else
		{
			System.out.println("it is an odd num");
		}
	}
}
