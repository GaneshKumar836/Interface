interface about//interface 1
{
	void info(); // abstract method declaration
}
interface staff//interface 2
{
	void teachstaff();
	void nonteachstaff();  // abstract methods declaration
}
class Student   // Base class
{
	int noofstudent;
	Student(int n) //constructor
	{
		noofstudent = n ;
	}
}
class Records extends Student implements about,staff// Derived class
{
	String collegename,city,state;
	int noofdepartment,noofteachstaff,noofnonteachstaff;
	Records(String cn,int nd,String c,String s,int ns,int ts,int nts)	// constructor
	{
		super(ns);
		collegename = cn;
		noofdepartment = nd;
		city = c;
		state = s;
		noofteachstaff = ts;
		noofnonteachstaff = nts;
	}
	public void info()//interface 1 abstract method
	{
		System.out.println("College Name: " + collegename);//print statement
		System.out.println("Number of Department: " + noofdepartment);//print statement
		System.out.println("City Name: " + city);//print statement
		System.out.println("State Name:  " + state);//print statement
		System.out.println("Number of Students: " + noofstudent);//print statement
	}
	public void teachstaff() //interface 2 abstract method 1
	{
		System.out.println("Number of Teach staff " + noofteachstaff);//print statement
	}
	public void nonteachstaff()//interface 2 abstract method 2
	{
		System.out.println("Number of Non Teach Staff  " + noofnonteachstaff);//print statement
	}
}
public class Sinfo {//main class

	public static void main(String[] args) {//main method of the class-prototype method
		Records r = new Records("Aditya Engineering College",1,"Kakinada","Andhra Pradesh",50000,1500,770);//object creating derived class constructor
		r.info();//abstract method 1 calling
		r.teachstaff();//abstract method 1 calling
		r.nonteachstaff();//abstract method 1 calling
	}

}

