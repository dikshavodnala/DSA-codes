import java.util.*;
class person
{
int id;
String name;
person()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter id and name");
id=sc.nextInt();
name=sc.next();
}
void display()
{
System.out.println("Id="+id+" "+"Name="+name);
}
}
class account extends person
{
int acc_no;
account(){
super();
Scanner sc=new Scanner(System.in);
System.out.println("enter account no=");
acc_no=sc.nextInt();
}
void display()
{
super.display();
System.out.println("Account number="+acc_no);
}
}

class customer extends account
{
double balance;
customer()
{
super();
Scanner sc=new Scanner(System.in);
System.out.println("Enter balance=");
balance=sc.nextDouble();
}
void display()
{
super.display();
System.out.println("Balance="+balance);
}
}
class multilevel{
public static void main(String args[])
{
customer c=new customer();
c.display();
}
}
