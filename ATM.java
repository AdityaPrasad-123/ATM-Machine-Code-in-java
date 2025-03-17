import java.util.*;
public class ATM
{
    private float balance;
    private int password;
    public void deposit()
    {  
        Scanner s=new Scanner(System.in);
        System.out.print("enter your password:");
        password=s.nextInt();
        if(password==123)
        {
            System.out.println("welcome to SBI Bank");
            Scanner k=new Scanner(System.in);
            System.out.print("enter the money to deposit:");
            float money=k.nextInt();
            balance=balance+money;
            System.out.println("Your Current balance:"+balance);
            System.out.print("Very thankful to banking with us Ayush , Best wishes");
        }
        else
        {
          System.out.print("Your password is wrong ,Try again");
        }
    }
    public void withdraw()
    {   
        Scanner v=new Scanner(System.in);
        System.out.print("enter your password:");
        password=v.nextInt();
        if(password==123)
        {
            System.out.println("welcome to SBI Bank");
            Scanner p=new Scanner(System.in);
            System.out.print("enter the money to withdraw:");
            float money=p.nextInt();
            balance=balance-money;
            System.out.print(" Your Current balance:"+balance);
             System.out.print("Very thankful to banking with us Ayush,Best wishes");
        }
        else
        {
          System.out.print("Your password is wrong\nTry again");
        }
    }  
    public void check()
    {  
        Scanner m=new Scanner(System.in);
        System.out.print("enter your password:");
        password=m.nextInt();
       if(password==123)
        {
            System.out.println("welcome to SBI Bank");
            System.out.print("Your total balance:"+balance);
            System.out.print("Very thankful to banking with us Ayush, Best wishes");      
        }
        else
        {
          System.out.print("Your password is wrong\nTry again");
        }
    }
 

 public static void main(String[] args)
    {
     ATM r=new ATM();
     int option;
     Scanner t=new Scanner(System.in);
     System.out.println("Chose your option");
     System.out.println("1.deposit");
     System.out.println("2.withdraw");
     System.out.println("3.check");
     System.out.print("Enter your option\nAyush Bhai:");
     option=t.nextInt();
     switch(option)
        {
         case 1:
         r.deposit();
         break;
         case 2:
          r.withdraw();
          break;
         case 3:
          r.check();
          break;
         default :System.out.print("Invalid choice");
        }
            


    }
}
    
