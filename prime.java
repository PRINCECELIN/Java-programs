import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		
		int num=B.read();
		B.prime(num);
	}
}
class B
{
	public static int read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
		return num;

	}
	public static void prime(int num)
	{
      int count=0;
	  for (int i=1;i<=num ;i++ )
	  {
		  if (num%1==0)
		  {
			  count++;
		  }
	  }
	  if(count>2)
		{
		  System.out.println("it is an composite num"+count);
		}
		else
		{
		System.out.println("it is an prime num"+count);
		}
	}
}

