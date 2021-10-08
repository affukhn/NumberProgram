import java.util.Scanner;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(prime(num))
			System.out.println(num +" prime number ");
		else
			System.out.println(num +" not a prime number");
	}
		public static boolean prime(int num)
	   {
			for (int i=2;i<num;i++)
			{
				if(num%i==0)
				return false;
			}
			return true;
	   }
}
