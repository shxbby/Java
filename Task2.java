import java.util.*;
class New
{
	Scanner sc=new Scanner(System.in);
	int a[] = new int[10];
	New()
	{
		for(int i=1; i<10; i++)
		{
			System.out.println("Enter a valu of a["+i+"]");
			a[i] = sc.nextInt();
		}
		for(int i =0 ;i <10;i++)
		{
			System.out.println("value Of a["+i+"]:"+a[i]);
		}
	}
}


class Old extends New
{
	Old()
	{
		for(int i=0;i<10;i++)
		{
			if(a[i]%2 ==0)
				System.out.println(a[i]+" This number is Even");
			else
				System.out.println(a[i]+" This Numvber is Odd");
		}

	}
}

class Task2
{
	public static void main(String[] args) 
	{
		New n= new New();
		Old o= new Old();	
	}
}