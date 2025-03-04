class Student{
String name;
int rollno;
String section;
Student(String name,int rollno,String section){
this.name=name;
this.rollno=rollno;
this.section=section;
}

public void printDetails(){
System.out.println("Student details");
System.out.println(this.name+", " + this.rollno + ", " + section);
}}
class Mprg{
public static void main(String args[])
{
Student student1=new Student("Robert",1,"XI A");
Student student2=new Student("Adam",2,"XI B");
Student student3=new Student("Julie",3,"XI C");
student1.printDetails();
student2.printDetails();
student3.printDetails();
}
}

