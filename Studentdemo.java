package arith;

class Student 
{
	public String name;
	public int rollno;
	public void display()
	{
		String title = "ABC";
		System.out.println(title);
		System.out.println(name);
		title = "Roll no :";
		System.out.println(title);
		System.out.println(rollno);
	}
}
class Studentdemo
{
	public static void main(String[] args) 
	{
	Student s = new Student();
	s.display();
	}
}
