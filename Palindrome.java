class Palindrome 
{
	public static void main(String[] args) 
	{
		int num=232,rem=0,sum=0,temp=num;
		while (num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if (sum==temp)
		{
			System.out.println("it is an palindrome "+sum);
		}
		else
		{
			System.out.println("it is an not palindrome no"+sum);
		}
	}
}
