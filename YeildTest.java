
public class YeildTest
{
	public static void main(String args[])
	{
		
		var obj = new YeildTest();
		Runnable r = () ->{
			System.out.println(Thread.currentThread().getName()+" is waiting to enter");
				try{
					Thread.yield();
					//Thread.sleep(5000);
				}catch(InterruptedException e){}
				System.out.println(Thread.currentThread().getName()+" is completed");
		};
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		Thread t4 = new Thread(r);
		
		
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t4.setName("Thread-4");
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	
}