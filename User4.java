import java.util.Scanner;
class User4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value a");
		double a=sc.nextDouble();

        System.out.println("enter the value b");
		double b=sc.nextDouble();
		char ch='+';
		switch (ch)
		{
			 case ('+'):System.out.println("add of two num of "+(a+b));
			 case ('-'):System.out.println("sub of num of "+(a-b));
			 case ('*'):System.out.println("mult of num of "+(a*b));
			 case ('/'):System.out.println("div of num of "+(a/b));
			 case ('%'):System.out.println("mod of num of "+(a%b));
			 break;
			 default:System.out.println("inval" );
		}

	}
}
