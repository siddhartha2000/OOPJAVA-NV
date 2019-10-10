import java.util.*;

class account
{
	String cust_name;
    double acc_number,bal,amt;
    int type_of_acc;

    void setdata()
	    {
		    Scanner s1 = new Scanner(System.in);
		    System.out.println("Input account details");
		    System.out.println("Enter name of the book");
		    cust_name=s1.next();
		    System.out.println("Enter account number");
		    acc_number=s1.nextDouble();
		    System.out.println("Enter the current balance");
		    bal=s1.nextDouble();	
		
	    }
}
class sav_acc extends account
{	
    Scanner s1 = new Scanner(System.in);
    void deposit()
    {
         System.out.println("Enter amount to be deposited");
         amt=s1.nextDouble();
         bal+=amt;
    }
    void display()
    {
        System.out.println("The balance is " + bal);
    }
    void interest()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter rate");
        double rate =s1.nextDouble();
        System.out.println("Enter time");
        int time =s1.nextInt();
        System.out.println("Enter the no. of times the interest is compounded");
        int n =s1.nextInt();
        amt=bal*Math.pow((1+(rate/n)),n*time);
        bal-=amt;
    }
    void withdrawal()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawed");
        double amt =s1.nextDouble();
        if(amt>bal)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            bal-=amt;
        }
    }

}

class curr_acc extends account
{
	Scanner s1 = new Scanner(System.in);
    System.out.println("Enter minimum balance");
    double min_bal =s1.nextDouble();
    void deposit()
    {
         if(bal>min_bal)
        {
            System.out.println("Enter amount to be deposited");
            amt=s1.nextDouble();
            bal+=amt;
        }
        else{
            System.out.println("The service charge of 500 is imposed due minimum balance criteria not met ");
            bal-=500;
        }
    }
    void display()
    {
        System.out.println("The balance is " + bal);
    }
    void interest()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter rate");
        double rate =s1.nextDouble();
        System.out.println("Enter time");
        int time =s1.nextInt();
        System.out.println("Enter the no. of times the interest is compounded");
        int n =s1.nextInt();
        amt=bal*Math.pow((1+(rate/n)),n*time);
        bal-=amt;
        if(bal<min_bal)
        {
            System.out.println("The service charge of 500 is imposed due minimum balance criteria not met ");
            bal-=500;
        }
    }
    void withdrawal()
    {
        if(bal>min_bal)
        {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter amount to be withdrawed");
            double amt =s1.nextDouble();
            if(amt>bal)
            {
                System.out.println("Insufficient balance");
            }
            else
            {
                bal-=amt;
            }
        }
        else{
            System.out.println("The service charge of 500 is imposed due minimum balance criteria not met ");
            bal-=500;
        }
    }
}





class bank
{
public static void main(String a[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter choice of account 1.Savings 2.Current");
    int choice= s.nextInt();
    if(choice=1)
    {
        System.out.println("Welcome to your savings account ");
        String ch;
        sav_acc a=new sav_acc();
        a.setdata();
        a.type_of_acc=1;
	    do
	    {
		    System.out.println("Enter choice 1.Deposit 2.Display 3.Interest 4.Withdraw");
		    int choice1= s.nextInt();
		    switch(choice) 
        	{
            		case 1:a.deposit(); 
            		break;
            		case 2:a.display();
            		break;
            		case 3:a.interest();
            		break;
                    case 4:a.withdraw();
            		break;
            		default:System.out.println("Invalid input"); 
            		break;
        	}
		    System.out.println("Do you wish to continue"); 
		    System.out.println("Enter choice y/Y FOR YES AND N/n for no"); 
		    ch = s.next();      
	    }while(ch.equals("y") || ch.equals("Y"));	
    }
    else{
        System.out.println("Welcome to your current account ");
        String ch;
        curr_acc a=new curr_acc();
        a.setdata();
        a.type_of_acc=2;
	    do
	    {
		    System.out.println("Enter choice 1.Deposit 2.Display 3.Interest 4.Withdraw");
		    int choice1= s.nextInt();
		    switch(choice) 
        	{
            		case 1:a.deposit(); 
            		break;
            		case 2:a.display();
            		break;
            		case 3:a.interest();
            		break;
                    case 4:a.withdraw();
            		break;
            		default:System.out.println("Invalid input"); 
            		break;
        	}
		    System.out.println("Do you wish to continue"); 
		    System.out.println("Enter choice y/Y FOR YES AND N/n for no"); 
		    ch = s.next();      
	    }while(ch.equals("y") || ch.equals("Y"));	
    }
}
}