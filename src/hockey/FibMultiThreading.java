package hockey;

public class FibMultiThreading extends Thread {
    private int x;
    public int answer;
    private static int count = 0;


    public FibMultiThreading(int x) {
        this.x = x;
    }

    @Override
	public void run() {
    	count++;
        if (x == 0){
            answer = 0;
        }else if( x == 1 || x == 2 ) {
            answer = 1;
        }else {
            try {
                /*
                 * Below we are invoking 2 threads to compute separate values
                 * This will for a tree structure
                 */
                FibMultiThreading f1 = new FibMultiThreading(x-1);
                FibMultiThreading f2 = new FibMultiThreading(x-2);
                f1.start();
                f2.start();
                f1.join();
                f2.join();
                answer = f1.answer + f2.answer;
            }catch(InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        try {
            int inputNum = 10;
            FibMultiThreading f = new FibMultiThreading(inputNum);
            f.start();
            f.join();
            System.out.println("Fibonacci number at "+inputNum+" position is:"+f.answer);
            System.out.println("count is:"+f.count);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}