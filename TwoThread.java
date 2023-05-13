class ThreadT extends Thread
{
    private int miliseconds;
    public ThreadT(String s, int miliseconds)
    {
        super(s);
        this.miliseconds = miliseconds;
        start();
    }
    public void run()
    {
        try{
            Thread.sleep(miliseconds);
            System.out.printf("\nIn " +Thread.currentThread().getName());
        }
        catch(Exception e){}
    }
}
 
class TwoThread
{

    public static void main(String[] args)
    {
        System.out.println("In Thread " +Thread.currentThread().getName());
        ThreadT t1= new ThreadT("Thread 1",2000);
        ThreadT t2= new ThreadT("Thread 2",4000);
    }
}

