import java.util.Scanner;
class Armstrong2 
{
	public static void main(String[] args) 
	{   
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int num=sc.nextInt();
		  find();
	}
		public static find()
		{
          int num=0,sum=0,rem=0,temp=num;
		 while(num>0)
		{
		 rem=num%10;
		 sum=sum+(rem*rem*rem);
		 num=num/10;
		}
		
		if(sum==temp)
	        {      
			System.out.println("it is an armstrong no");
	        }
			else
	       {
				System.out.println("it is an not armstrong no");
		   }
		}



	}
