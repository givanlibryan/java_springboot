import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class ThreadHello implements Runnable {

    private final String name;

    public ThreadHello(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(name + ": Hello");
        try {
            Thread.sleep(250);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testRun() {
        for (int i = 0; i < 5; i++) {
            ThreadHello instance = new ThreadHello(String.valueOf(i));
            Thread t = new Thread(Instance);
            t.start();
        }
    }

}