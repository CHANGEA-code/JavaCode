package works;

public class Example17_5 {
	public static void main(String args[]) {
		new SimpleThread("First").start();
		new SimpleThread("Second").start();
	}
}

class SimpleThread extends Thread {
	public SimpleThread(String str) {
		super(str);
	}

	public void run() {
		for (int i = 0; i < 10; ++i) {
			System.out.println(i + " " + getName());
		
		try {
			sleep((int) (Math.random() * 1000));
		} catch (InterruptedException e) {
		}
	}
		System.out.println("DONE! " + getName());
	}
}
