package calculator;
//import Calculator_1;
import java.util.Scanner;

public class Calc_2 extends Calculator_1{
	public Calc_2(){
	super();}
	public static void main(String[] args) {
	double a,b;
	int choice;
	Scanner sc=new Scanner(System.in);
	
	a=sc.nextDouble();
	b=sc.nextDouble();
	System.out.println("\"1.Add\\n2.Subtract\\n3.Multiply\\n4.Divide\\nEnter choice:\"");
	choice=sc.nextInt();
	
	Calculator_1 c=new Calculator_1(a,b);
	switch(choice)
	{
	case 1:
		System.out.println(c.add());
		break;
	case 2:
		System.out.println(c.subtract());
		break;
	case 3:
		System.out.println(c.multiply());
		break;
	case 4:
		System.out.println(c.divide());
		break;
	default:
		System.exit(0);
	}
	
	
	}
}
