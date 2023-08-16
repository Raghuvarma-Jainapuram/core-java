package thread;

class Table
{
    synchronized static void printTable (int n)
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println (n * i);
            try
            {
                Thread.sleep (400);
            } 
            catch (Exception e)
            {
            }
        }
    }
}

class MyThread1 extends Thread
{
    public void run ()
    {
        Table.printTable (1);
    }
}

class MyThread10 extends Thread
{
    public void run ()
    {
        Table.printTable (10);
    }
}

class MyThread100 extends Thread
{
    public void run ()
    {
        Table.printTable (100);
    }
}

class MyThread1000 extends Thread
{
    public void run ()
    {
        Table.printTable (1000);
    }
}

public class StaticSynchronizationTables {
    public static void main (String t[]){
        MyThread1 t1 = new MyThread1 ();
        MyThread10 t2 = new MyThread10 ();
        MyThread100 t3 = new MyThread100 ();
        MyThread1000 t4 = new MyThread1000 ();
        t1.start ();
        t2.start ();
        t3.start ();
        t4.start ();
    }
}
