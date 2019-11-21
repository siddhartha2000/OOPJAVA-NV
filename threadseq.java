class thread1 extends Thread
{   
    int num;
    thread1(int a)
    {
        num = a;
        this.start();
    }
    public void run()
    {
        try
        {
            if(num<=5)
            {
                thread1 t = new thread1(num+1);
                this.sleep(3000/num);
                System.out.println("Thread"+num);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println("Interrupted");
        }
        
        
    }
}

class threadseq
{
    public static void main(String args[])
    {
        try
        {
            thread1 t = new thread1(1);
        }
        catch(Exception ie)
        {
            System.out.println("Interrupted");
        }
    }
    
}