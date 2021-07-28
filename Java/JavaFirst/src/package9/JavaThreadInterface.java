package package9;
class Second implements Runnable{
	int ticket=0;
	public synchronized void run() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(ticket++ <2)
			System.out.println(name+" got a movie ticket");
		else
			System.out.println(name+" didn't get a movie ticket");
		
	}
}
public class JavaThreadInterface  {
	public static void main(String[] args) {
		Second obj=new Second();
		Thread t1=new Thread(obj,"Raju");
		Thread t2=new Thread(obj,"Shyam");
		Thread t3=new Thread(obj,"Babu bhaiya");
		t1.start();
		t2.start();
		t3.start();
	}
}
