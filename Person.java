
//1] Write a program to use “this‟ to refer the current class parameterized constructor and current class instance variable
//this demo

public class Person
{
	String name;
	Person ( )
	{
	this ("Mr.Thanos");	 // calling present class parameterized constructor 
	display ( ); // calling present class method
	}
	Person (String name)
	{
	this.name = name; // assigning present class variable with parameter "name"
	}
	void display( )
	{
	System.out.println ("Person Name is = " + name);
	}
}
	
