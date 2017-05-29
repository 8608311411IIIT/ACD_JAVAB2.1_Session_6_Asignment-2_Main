//A simple program which throws a user defined exception as the withdrawal amount exceeds balance or balance  is less than 10000
import java.lang.Exception;
import java.util.*;
class BankATMException extends Exception{//user defined exception extends Exception class
        
  
     BankATMException(String s){
           super(s);//passing s to constructor of super class
     }

   
}

class BankAtm{

     private int atmId;
     private String bankName;
     private String location;
     static double balance=12000;
     public BankAtm(){
            atmId=123456;
            bankName="IIIT_Chennai";
            location="Kancheepuram";
          

     }

        public void withdraw(double amt){//withdraw method manipulate data if amount is taken out or else throw excption
               try{
                  if(balance<10000)
                          throw new BankATMException("Balance is less than than 10000");

                       else if(amt>balance)
                              throw new BankATMException("Atm doesnt have as much cash as u want to withdraw");

                           else{
                                balance=balance-amt;
                                System.out.println("Transaction sucessfull.Amount left "+balance);
                           }
                  }

                    catch(BankATMException e){
                          System.out.println(e);
                    }
        }

           public void deposit(double amt){//deposit method manipulate atm amount as money is deposited
                   balance=balance+amt;
                   System.out.println("Deposit Successful.Amount available "+balance);
           }
}
public class Session6b{

     public static void main(String []args){
            int amt,i;
            Scanner sc=new Scanner(System.in);
            BankAtm b[] =new BankAtm[3];
            for(i=0;i<3;i++){
               
                      b[i]=new BankAtm();
                      System.out.println("Enter your choice  1.withdraw   2.Deposit");
                      int choice=sc.nextInt();
                      if(choice==1){
                            System.out.println("Enter amount to withdraw");
                            amt=sc.nextInt();
                            b[i].withdraw(amt);
                      }

                         else if(choice==2){
                             System.out.println("Enter amount to deposit");
                             amt=sc.nextInt();
                             b[i].deposit(amt);
                         }

                
            }
              
     }
}
