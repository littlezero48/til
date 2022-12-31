import static java.lang.Thread.sleep;

public class multiThreadAndStaticVariable {
    static int share;

    // tip: arguments are passed via the field below this editor
    public static void main(String[] args)
    {
        multiThreadAndStaticVariable t1 = new multiThreadAndStaticVariable();
        multiThreadAndStaticVariable t2 = new multiThreadAndStaticVariable();

        t1.run();
        t2.run();
    }

    public void run(){
        for(int count = 0; count < 10; count++){
            System.out.println(share++);

            try{ sleep(1000); }
            catch(InterruptedException e){}
        }
    }
}
