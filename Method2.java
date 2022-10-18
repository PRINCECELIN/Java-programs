import java.util.Scanner;
class Method2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
	    String res=even(num);
		System.out.println(num);
		
	}
	public static void even( int num)
	{
		if (num%2==0)
		{
		  return  ("it is an even no"+num);
		}
		else
		{
		  return  ("it is an odd no"+num);
		}
		
	}
}
