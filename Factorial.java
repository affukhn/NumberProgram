import java.util.Scanner;
class  Factorial
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		System.out.println(num +"! = " +fact(num));
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
