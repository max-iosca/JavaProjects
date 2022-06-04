package com.corso.java.orangee.OtherProjectsAndTest.EserciziRemoBoh.PassaggioArgomenti.src;

class MyInt
{
	public int val;
}

public class PassaggioArgomenti 
{
	public static void fooNonMod(int a_in_method) 
	{
		a_in_method = 100;
	}

	public static void fooMod(MyInt a_in_method_rif)
	{
		a_in_method_rif.val = 100;
	}
	
	
	public static void main(String[] args)
	{
		MyInt an_int = new MyInt();
		an_int.val = 200;
		fooMod(an_int);
		System.out.println("an_int.val vale: " + an_int.val);
		
		int c = 200;
		fooNonMod(c);
		System.out.println("c vale: " + c);

	}

}
