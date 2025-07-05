package L15;

public class SteckTrace {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        Thread curret = Thread.currentThread();
        StackTraceElement[] metods = curret.getStackTrace();

        for (var info: metods){
            System.out.println(info);
        }
    }
}
