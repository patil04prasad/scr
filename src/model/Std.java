package model;

public class Std
{
	int marks;
	String grade;
	String name;
	
	Std(int marks,String grade,String name)
	{
		this.marks=marks;
		this.grade=grade;
		this.name=name;
	}
	

	public String toString()
	{
		return marks+"   "+grade+"  "+name;
	}
}
