package demo;

public class Calculator {
	
	public int add(int num1, int num2)
	{
		int r = num1+num2;
		return r;
	}
	
	public int sub(int num1, int num2)
	{
		int r = num1 - num2;
		return r;
	}
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println(cal.add(5, 4));
		cal.add(5, 4);
		cal.sub(5, 4);
		System.out.println("I am Saket corr");
	}


}
