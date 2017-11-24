import java.util.*;
public class Course {
private String name;
private int numOfStudent;
private Student[] students;
public Course(String n,int size){
name=n;
numOfStudent=0;
students=new Student[size];}

public boolean addStudent(Student S){
if (numOfStudent<students.length){
students[numOfStudent++]=S;
return true;}
return false;}

public Student ComputerGrade(int index,double mark){
Scanner console=new Scanner (System.in);

boolean flag=true;
while (flag){
try {
if (mark>=90 && mark<=100)
students[index].setGrade('A');
if (mark>=80 &&mark<90)
students[index].setGrade('B');
if (mark>=70 && mark<80)
students[index].setGrade('C');
if (mark>=60 && mark<70)
students[index].setGrade('D');
if (mark<60)
students[index].setGrade('F');
flag=false;}
catch (ArrayIndexOutOfBoundsException e){
System.out.println("The index you entered is invalid!"+"\nTry again");
index=console.nextInt();
}}

Student s=new Student(students[index].getName(),students[index].getID(),students[index].getGrade());
return s;
}}




