import java.util.*;
public class test {
static Scanner console=new Scanner (System.in);
public static void main (String[] args){

Course CSC=new Course("CSC113",3);
String name="";
int id=0;
char g=' ';
Student s;
for (int i=0;i<2;i++){
System.out.println("Enter the student's Name, ID,Grade");
try {

name=console.next();
id=console.nextInt();
g=console.next().charAt(0);
}
catch (InputMismatchException e){
System.out.println("Invalid Entry.");
System.out.println("The student has not been added successfully");
}
s=new Student(name,id,g);




boolean add=CSC.addStudent(s);}

System.out.println("Enter the index of the student,and his mark:");
int index=console.nextInt();
double mark=console.nextDouble();

Student stu=CSC.ComputerGrade(index,mark);
System.out.println(stu);}}




