package calculator;

public class Calculator_1 implements calc {
	private double a;
	private double b;
	public Calculator_1(double a, double b)
	{
		this.a=a;
		this.b=b;
	}
	public Calculator_1() {}
	
	public double add()
	{
		return a+b;
	}
	public double multiply()
	{
		return a*b;
	}
	public double subtract()
	{
		return a-b;
	}
	public double divide()
	{
		return a/b;
	}

}
