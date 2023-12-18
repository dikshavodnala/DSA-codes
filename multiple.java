import java.util.*;

interface account{
int acc_no=10;
void show();
}

class person{
String name;
void accept()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
name=sc.next();
}
void display()
{
System.out.println("Name="+name);
}
}
class customer extends person implements account
{
double balance;
void accept()
{
super.accept();
Scanner sc=new Scanner(System.in);
System.out.println("enter balance");
balance=sc.nextDouble();
}
void display()
{
super.display();
System.out.println("Balance="+balance);
}
public void show()
{
System.out.println("Account number="+acc_no);
}
}
class multiple
{
public static void main(String args[])
{
customer c=new customer();
c.accept();
c.display();
c.show();
}
}