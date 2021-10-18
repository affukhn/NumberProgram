import java.util.Scanner;
class sumOfFac 
{
	public static void main(String[] args) 
	{
		int num=read();
		System.out.println("sum of Factor is "+ sumOfFac(num));
	}
	public static int read()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number");
		return sc.nextInt();
	}
	public static int sumOfFac(int lol)
	{
		int sos=0;
		for (int i=1;i<lol;i++)
		{
			if(lol%i==0)
			{
				System.out.print (i +" ");
			     sos+=i;
			}
		}
		System.out.println();
		return sos;
	}
}
