package practice1;
import java.io.*;
class Emp{
	//static variable salary
	public static double salary;
	public static String name = "Harsh";
}

public class SampleProgram {

	public static void main(String[] args)
	{
		// accessing static variable without object
		Emp.salary = 1000;
		System.out.println(Emp.name + "'s average salary:" + Emp.salary);
		

	}

}
