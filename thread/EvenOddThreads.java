package thread;
class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println("Even: " + i);
            try { 
            	Thread.sleep(500); 
            	} catch (InterruptedException e) {
            		e.printStackTrace(); }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i += 2) {
            System.out.println("Odd: " + i);
            try {
            	Thread.sleep(500);
            	} 
            catch (InterruptedException e) {
            	e.printStackTrace(); }
        }
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        EvenThread evenTh = new EvenThread();
        OddThread oddTh = new OddThread();

        evenTh.start(); 
        oddTh.start(); 
    }
}
