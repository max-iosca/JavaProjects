package com.corso.java.orangee.OtherProjectsAndTest.EserciziRemoBoh.ArgomentoImmodificabile.src;

class AClass // classe superclasse/base
{
	public void printMe() 
	{
		System.out.println("CLASSE SUPERCLASSE");
	}
}

class AClass_child_1 extends AClass // classe subordinata/figlia di AClass
{
	public void printMe()
	{ 
		System.out.println("FIGLIO 1");
	}
}


class AClass_child_2 extends AClass // altra classe subordinata/figlia di AClass
{
	public void printMe()
	{
		System.out.println("FIGLIO 2");
	}
}

public class ArgomentoImmodificabile 
{
	public static void aMethod(AClass a_class)
	{
		a_class = new AClass_child_2();
		/* cambiamo il riferimento del parametro che punterà ad AClass_child_2
		senza che questo cambi il riferimento dell'argomento */
	}
	
	public static void main(String[] args) 
	{
		AClass an_object = new AClass_child_1();
		aMethod(an_object); // passiamo un oggetto che ha un riferimento ad AClass_child_1
		an_object.printMe();
		
		
		
		
	}

}
