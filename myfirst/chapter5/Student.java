package mypackage;
public class Student
{
    int age;
    // String gender;
    String name;
    public Student(String sName,int iAge)
    {
        name = sName;
        age = iAge;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public static void main(String [] args)
    {
        Student temp = new Student("Me",20);
        System.out.println("Student info, name: " + temp.getName() + " age: " 
        + temp.getAge());
        System.out.println("Bye");
    }
}