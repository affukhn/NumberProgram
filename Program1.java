import java.util.Scanner;
class FactorOfNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		for (int i=1;i<=num;i++)
		{
			if(num%i==0)
				System.out.println(i+" is factor of the "+num);
			else
				System.out.println(i+" is not factor of the "+num);
		}
	}
}
