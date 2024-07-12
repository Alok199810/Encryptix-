import java.util.Scanner;
import java.util.Random;
class game
{
  public  char s;
 public int number;
 public int guess;
 public int count=0;
 public int   getCount()
    {
  return count;
    }
 public void setCount(int  count){

    this.count=count;
 }
    
game()
    {
       Random rand= new Random();
     this.number=rand.nextInt(100);
    }
    
    void takeinput(){
        System.out.println("Please enter the guess no 1-100 ");
        Scanner sc=new Scanner(System.in);
        guess= sc.nextInt();
    
    }
   
 boolean forcorrect(){
        count++;
        if(count>=10)
        {
System.out.println("Sorry you loss your attempts is more than 10. Play again. ");
        }
         else if(guess==number)
        {
            System.out.format("yes you are right correct no is %d/ attempts are %d",number,count);
            return true;
        }
        else if(guess<number)
        {
            System.out.println("No is too low");
        }
       
     else if(guess>number){
System.out.println("No is too big");
        }
return false;
    }
}
class aa
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char s;
        do{
        game g=new game();
        boolean b=false;
      
        while(!b){
 g.takeinput();
 b=g.forcorrect();
 
}
    System.out.println("\n Do you want to play again press y");
  s=sc.nextLine().charAt(0);
 } while(s=='y'|| s=='Y');
 }

}

