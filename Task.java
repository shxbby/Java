import java.util.*;
class First
{
	
	First()
	{
	System.out.println(" Odd and Even Number  ");
	for(int i=1; i<=25; i++){

		if(i%2 ==0)
			System.out.println(i+":Number is Even");

		else
	
		System.out.println(i+":Number Is Odd");
	}


	}
	
}

class Secound extends First
{
	Secound()
	{
		int a=15;
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+"x"+i+"="+(a*i));
		}
	}
}
class Task
{
	public static void main(String[] args) 
	{
		First F= new First();
		Secound s = new Secound();
	}
}