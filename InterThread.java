public class InterThread
{
	public static void main(String args[])
	{
		final Mail newMail = new Mail();
		
		Runnable r1 = () ->{
			
			System.out.println("Mail reader is waiting for mail to come.......");
			
			try{
				
				synchronized(newMail)
				{
					newMail.wait();
				}
				
			}catch(InterruptedException e){System.out.println("I am Interrupted");}
			
			System.out.println("New Mail has arrived ->"+newMail.getMail());
		};
		
		final Thread thread1 = new Thread(r1);
		
		Runnable r2 = () -> {
			
			try{
				
				Thread.sleep(10000);
				synchronized(newMail)
				{
					newMail.setMail("Hey! Sorry for keep you waiting for me!");
					
					thread1.sleep(500);
				}
			}catch(InterruptedException e){System.out.println("I have interrupted thread1");}
		};
		
		
		
		var thread2 = new Thread(r2);
		
		
		thread1.start();
		
		thread2.start();
		
	}
}

class Mail
{
	private String mail;
	public void setMail(String mail)
	{
		this.mail = mail;
	}
	
	public String getMail()
	{
		return mail;
	}
}