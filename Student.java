public class Student {
private String name;
private int ID;
private char Grade;

public Student(String n,int id,char g){
name=n;
ID=id;
Grade=g;}

public void setGrade(char g){
Grade=g;}

public char getGrade(){
return Grade;}

public String getName(){
return name;}

public int getID(){
return ID;}

public String toString(){
return "Name: "+name+"\nID: "+ID+"\nGrade: "+Grade;}}