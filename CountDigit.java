import java.util.Scanner;
class  CountDigit
{
	public static void main(String[] args) 
	{
	      Scanner sc=new Scanner(System.in);
		  System.out.println("enter the number");
		  int num=sc.nextInt();
		  System.out.println("number of digit are " +count(num));
	}
	public static int count(int num)
	{
		int count=0;
		while(num>0) //while(num!=0)
		{
			num/=10;
            count++;
		}
		return count;
	}
}
