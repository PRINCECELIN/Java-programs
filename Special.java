class Special 
{
	public static void main(String[] args) 
	{
		int num=145,sum=0,rem=0,fact=1,temp=num;
		while (num>0)
		{
			rem=num%10;
			for (int i=1;i<=rem ;i++ )
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if (sum==temp)
		{
			System.out.println("it is a special no "+sum);
		}
		else 
		{
		System.out.println("it is an no a special no"+sum);
		}
		
	}
}
