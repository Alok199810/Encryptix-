import java.util.Scanner;

class student
{
int n;
 int a[];
    String name;
    
    int Totalmarks=0;
    
    void fun(){
    
        System.out.println("enter your name");
    Scanner sc=new Scanner(System.in);
    name=sc.nextLine();

    System.out.println("enter total no of subjects");
    n=sc.nextInt();
a=new int[n];
for  (int i=0;i<n;i++)
    {
        System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");

       a[i]=sc.nextInt();
    
    Totalmarks = Totalmarks + a[i];

}
System.out.println("Total marks is =" +Totalmarks);

 float Avg_percentage= (Totalmarks)/n;
 System.out.println("Average percentage is =" +Avg_percentage);

 if(Avg_percentage>85)
 {
    System.out.println("Grade A");
 }
else if(Avg_percentage>70)
{
    System.out.println("Grade B");

}else if(Avg_percentage>50)
{
    System.out.println("Grade C");

}
else{
    System.out.println("Grade F low");

}
 sc.close();}
}
class Stu
{
    public static void main(String[] args)
    {
        student s=new student();
        s.fun();
        }
}
