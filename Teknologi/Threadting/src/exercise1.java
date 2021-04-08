//TODO Exercise 1
class thread1 extends Thread {
    public void run() {
        System.out.println(8);
    }
}

class thread2 extends Thread {
    public void run() {
        System.out.println(1);
    }
}

class thread3 extends Thread {
    public void run() {
        System.out.println(2);
    }
}

class thread4 extends Thread {
    public void run() {
        System.out.println(5);
    }
}


public class exercise1 {
    public static void soeMil() {
        thread2 foerste = new thread2();
        thread1 anden = new thread1();
        thread4 tredje = new thread4();
        thread3 fjerde = new thread3();

        foerste.start();
        try { Thread.sleep(3000); } catch (Exception e){}
        anden.start();
        try { Thread.sleep(3000); } catch (Exception e){}
        tredje.start();
        try { Thread.sleep(3000); } catch (Exception e){}
        fjerde.start();
    }

    public static void main(String[] args) {
        soeMil();
    }
}
