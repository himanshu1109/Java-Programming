
class T1  extends Thread{
	public void run() {
		int i = 100;
		while(i>=0) {
			System.out.println("Good Morning");
			i--;
		}
	}
}
class T2 extends Thread{
	public void run() {
		int i = 100;
		while(i>=0) {
			/*try {
				Thread.sleep(200);                      //sleep() delay the thread process for __ 200ms(i.e. 2000ms = 2s)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
			System.out.println("Welcome");
			i--;
		}
	}
}

public class printThread {

	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		//t1.setPriority(6);    // setting priority for processes
		//t2.setPriority(4);
		//System.out.println(t1.getPriority());   // getting priority for processes , by default , they have same priorities
		//System.out.println(t2.getPriority());
		t1.start();
		t2.start();
		//System.out.println(t1.getState());     // getting current state of process
		//System.out.println(t2.getState());
		//System.out.println(Thread.currentThread());   // returns current thread priority
	}

}
