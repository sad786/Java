public class ProcessTest
{
	private int S=1;
	private ProcessTest t;
	
	public void setObj(ProcessTest t)
	{
		this.t = t;
	}
	
	public static void main(String args[])
	{
		ProcessTest t = new ProcessTest();
		
		Thread t1 = new Thread(new P1());
		Thread t2 = new Thread(new P2());
		
		t1.start();
		t2.start();
		
	}
	private void U(int S)
	{
		S--;
	}
	
	private void V(int S)
	{
		S++;
	}
}


class P1 implements Runnable
{
	public void run()
	{
		while(true)
		{
			t.U(S);
			System.out.print("0");
			System.out.print("0");
			t.V(S);
			Thread.sleep(100);
		}
	}
}

class P2 implements Runnable
{
	public void run()
	{
		t.U(S);
		System.out.print("1");
		System.out.print("1");
		t.V(S);
		Thread.sleep(100);
	}
}
