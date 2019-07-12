


public class Deadlock
{
	public static void main(String args[])
	{
		final Thread main = Thread.currentThread();
		Thread t1=null,t2 = null;
		
		Runnable r1 = () ->{
			
			System.out.println(Thread.currentThread().getName()+" is waiting for Main Thread to complete");
			
			try{
				
				main.join();
				
			}catch(InterruptedException e){}
		};
		
		t1 = new Thread(r1);
		
		t1.setName("First Thread");
		
		
		
		t1.start();
		System.out.println(Thread.currentThread().getName()+" is waiting for Second Thread to complete");
		try{
			
			t1.join();
		}catch(InterruptedException e){}
	}
}