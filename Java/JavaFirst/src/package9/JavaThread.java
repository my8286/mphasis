package package9;
class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("prcess1");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("prcess2");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Thread3 extends Thread{
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("prcess3");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class JavaThread {
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
		t1.start();
		t2.start();
		t3.start();
		
	}

}
