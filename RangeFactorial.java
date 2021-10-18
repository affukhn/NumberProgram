import java.util.Scanner;
class  RangeFactorial
{
	public static void main(String[] args) 
	{
		;
		int num=read();
		for(int i=1;i<=num;i++)
		{
			System.out.println(i +"! = " +fact(i));
			System.out.println("**********love*********************");
			
		}
	}
	public static int read()
	{
       Scanner sc= new Scanner(System.in);
	   System.out.println("enter the range");
	   return sc.nextInt();
	}
	public static long fact(int num)
	{
		long fact=1;
		if(num==0 && num==1)
		{
			return 1;
		}
		else
		{
			while(num>0)
			{
				
				fact=fact*num;
				num--;
			}
			return fact;
		}
	}
}
