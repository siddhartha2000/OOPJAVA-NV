import java.util.*;
class switching
{
    public static void main(String x1[])
    {
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Enter 2 numbers");
        int x = s1.nextInt();
        int y = s1.nextInt();
        System.out.println("Enter operator");
        String c= s1.next();
        switch(c) 
        {
            case "+":System.out.println(x + c + y + "=" + (x+y)); 
            break;
            case "-":System.out.println(x + c + y + "=" + (x-y)); 
            break;
            case "*":System.out.println(x + c + y + "=" + (x*y)); 
            break;
            case "/":System.out.println(x + c + y + "=" + (x/y)); 
            break;
            default:System.out.println("Invalid input"); 
        }
        
           
    }
}


