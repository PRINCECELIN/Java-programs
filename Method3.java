import java.util.Scanner;
class Method3  
{
	public static void main(String[] args) 
	{
		char res=ch();
		System.out.println(ch);
		
	}
	public static char ch()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no a");
	int a=sc.nextInt();
	System.out.println("enter the no b");
	int b=sc.nextInt();
	
	if (a>b)
	{
		return ("true");
	}
	else
	{
		return ("false");
	}

}
}
