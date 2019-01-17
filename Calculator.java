import java.util.Scanner;
public class Calculator {
	public static void main(String args[]) {
		float a,b,result;
		char choice,ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide\n 5. Exit");
			choice=sc.next().charAt(0);
			System.out.println("Enter two numbers:");
			a=sc.nextFloat();
			b=sc.nextFloat();
			switch(choice)
			{
				case '1': result=a+b;
					  break;
				case 3: result=a*b;
					  break;
				default : System.out.println("Invalid choice\n");
			}
			System.out.println("-----------------");
		}while(choice!='5');
	}
}
