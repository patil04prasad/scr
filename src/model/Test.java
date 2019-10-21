package model;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test
{
	public static void main(String args[])
	{
		Function<Std ,String>f=s->
		{
			int marks=s.marks;
			String grade;
		
			if(marks>=80)grade="A{Dist}";
			else if(marks>60)grade="B{Sec}";
			else if(marks>45)grade="C{Thrd}";
			else if(marks>35)grade="D{Pass}";
			else grade="fail";
			return grade;
		};
		
		Predicate<Std>p=s->s.marks>=60;
		
		Std s1[]={new Std(70,"A","Avi");
		Std s2[]=new Std(85,"D","Prdp");
		
		};
	}
}
