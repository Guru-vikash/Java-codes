class ThreadT extends Thread
{
    public ThreadT()
    {
        super("Child Thread");
        start();
    }
    public void run()
    {
        for(int i=0;i<=10;i++)
        {
            System.out.println("In Thread " +Thread.currentThread().getName() + " : i = " + i);
        }
    }
}
 class ThreadClass
{
    public static void main(String[] args)
    {
        ThreadT tt = new ThreadT();
        for(int i=0;i<=10;i++)
        {
            System.out.println("In Thread " +Thread.currentThread().getName() + " : i = " + i);
        }
    }
}
