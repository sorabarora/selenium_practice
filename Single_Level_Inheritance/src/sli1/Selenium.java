package sli1;

public class Selenium extends Automation {
	
	public void method2()
	{
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Selenium s1=new Selenium();
		s1.method1();
		s1.method2();
		s1.a=10;
		System.out.println(s1.a);

	}

}
