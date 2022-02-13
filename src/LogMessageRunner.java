public class LogMessageRunner {
    public static void main(String[] args) {
        SystemLog x = new SystemLog();
        System.out.println(x.removeMessages("disk"));
        System.out.println(x.getMessageList());
    }
}
