package com.threadutil;

class Cabs
{
}

class BookCab implements Runnable
{
	Cab cab;
	String CabDriverName;

	public BookCab(Cab cab,String cabDriverName)
	{ 
		this.cab=cab;
		this.CabDriverName=cabDriverName;
	}
	public void run() 
	{ 
		synchronized(cab)
		{
			 try
			 { 
				 System.out.println(this.CabDriverName+" is waiting");
			
				 cab.wait(5000);
				 
				 System.out.println(this.CabDriverName+" is done waiting");
			 }
			 catch(InterruptedException e)
			 {
				 System.out.println(e);
			 }
		}
	}
}

class Notify implements Runnable
{ 
	Cab cab;
	public Notify(Cab cab)
	{ 
		this.cab=cab;
	}
	public void run()
	{
		synchronized(cab)
		{
			try {
				Thread.sleep(2000);
				 cab.notify();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}
	public class Cab{

    public static void main(String[] args) {
        Cab cab1 = new Cab();
        BookCab bookcab=new BookCab(cab1,"Jenny");
        Notify noti=new Notify(cab1);
        Thread t1 = new Thread(bookcab);
        Thread t2 = new Thread(noti);
        t1.start();
        t2.start();
    }
}